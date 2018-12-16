package com.pratice.SwaggerTest.controller;

import com.pratice.SwaggerTest.PO.UserPO;
import com.pratice.SwaggerTest.common.RestObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class DemoController {

    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public RestObject createUser(@RequestBody UserPO user){
        System.out.println("createUser:::"+user.toString());
        return new RestObject(HttpStatus.OK.value(), "新增成功.");
    }

    @ApiOperation(value = "修改用户" ,  notes="修改用户")
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @RequestMapping(value="/updateUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public RestObject updateUser(@RequestBody UserPO user){
        System.out.println("updateUser:::"+user.toString());
        if (user == null) {
            return new RestObject(HttpStatus.BAD_REQUEST.value(), "Bad Request");
        }
        return new RestObject(HttpStatus.OK.value(), "修改成功.");
    }

    @ApiOperation(value = "删除用户" ,  notes="删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = false, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
    public RestObject deleteUser(@RequestParam("userId") String userId){
        System.out.println("deleteUser:::"+userId);
        return new RestObject(HttpStatus.OK.value(), "删除成功.");
    }

    @ApiOperation(value = "查询用户" ,  notes="查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/queryUser",method=RequestMethod.GET)
    public RestObject queryUser(@RequestParam("userId") String userId){
        System.out.println("queryUser:::"+userId);
        UserPO user = new UserPO(userId, "张三", "******", "mao2080@sina.com");
        return new RestObject(HttpStatus.OK.value(), user);
    }

}
