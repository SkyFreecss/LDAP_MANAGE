package com.cn.ldap.service;

/**
 * Created by wejeh on 2017/5/17.
 * ldap登陆接口
 */
public interface LdapLoginService {
        String getLoginContext(String username,String password,String LDAP_URL,String LDAP_PRINCIPAL,String LDAP_FACTORY);
}
