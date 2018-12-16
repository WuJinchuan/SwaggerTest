package com.pratice.SwaggerTest.PO;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserPo", description = "User信息")
public class UserPO {
    @ApiModelProperty(value="String", notes = "user id", required = true)
    private String id;
    @ApiModelProperty(value="String", notes = "user name", required = false)
    private String userName;
    private String password;
    private String email;

    public UserPO() {
        //Empty Constructor
    }

    public UserPO(String email, String id, String userName, String password) {
        this.email = email;
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
