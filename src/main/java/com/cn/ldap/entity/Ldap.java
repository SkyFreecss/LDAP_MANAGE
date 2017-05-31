package com.cn.ldap.entity;

/**
 * Created by wejeh on 2017/5/15.
 */
public class Ldap {
    //ldap服务器默认端口为389
    private String username;
    private String password;
    private String LDAP_URL;
    //根据此参数确认用户所在位置
    private String LDAP_PRINCIPAL;

    //LDAP驱动
    private String LDAP_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";

    public String getLDAP_URL() {
        return LDAP_URL;
    }

    public void setLDAP_URL(String LDAP_URL) {
        this.LDAP_URL = LDAP_URL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getLDAP_FACTORY() {
        return LDAP_FACTORY;
    }

    public String getLDAP_PRINCIPAL() {
        return LDAP_PRINCIPAL;
    }

    public void setLDAP_PRINCIPAL(String LDAP_PRINCIPAL) {
        this.LDAP_PRINCIPAL = LDAP_PRINCIPAL;
    }
}
