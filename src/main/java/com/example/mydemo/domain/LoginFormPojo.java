package com.example.mydemo.domain;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

public class LoginFormPojo {
    private String login;
    private String password;

    public LoginFormPojo() {
    }

    public LoginFormPojo(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
