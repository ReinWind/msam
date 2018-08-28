package com.github.wxiaoqi.security.auth.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class UserConfiguration {
    @Value("${jwt.token-header}")
    private String userTokenHeader;

    public String getUserTokenHeader() {
        return userTokenHeader;
    }

    public void setUserTokenHeader(String userTokenHeader) {
        this.userTokenHeader = userTokenHeader;
    }
}
