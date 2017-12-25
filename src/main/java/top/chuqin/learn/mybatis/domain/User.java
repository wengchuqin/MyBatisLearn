package top.chuqin.learn.mybatis.domain;

import java.io.Serializable;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String loginname;
    private Integer password;

    public User() {
    }

    public User(Integer id, String username, String loginname, Integer password) {
        this.id = id;
        this.username = username;
        this.loginname = loginname;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password=" + password +
                '}';
    }
}
