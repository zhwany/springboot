package com.atguigu.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author mabo
 * @Date 2022/8/4 11:13
 */
@Component
public class DataSourceProperties {
    @Value("${spring.jdbc.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.jdbc.datasource.url}")
    private String url;
    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @Value("${spring.jdbc.datasource.password}")
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
