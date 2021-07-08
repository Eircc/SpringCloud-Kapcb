package com.kapcb.ccc.auth.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.code.RandomValueAuthorizationCodeServices;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * <a>Title: RedisAuthenticationCodeServiceImpl </a>
 * <a>Author: Kapcb <a>
 * <a>Description:  <a>
 * 将授权码保存到Redis中, 确保认证服务器集群的一致性
 *
 * @author Kapcb
 * @version 1.0.0
 * @date 2021/7/8 22:41
 */
@Slf4j
@Service
public class RedisAuthenticationCodeServiceImpl extends RandomValueAuthorizationCodeServices {

    private final RedisConnectionFactory redisConnectionFactory;

    public RedisAuthenticationCodeServiceImpl(@Autowired RedisConnectionFactory redisConnectionFactory) {
        Assert.notNull(redisConnectionFactory, "redis connection factory can not be null");
        this.redisConnectionFactory = redisConnectionFactory;
    }

    @Override
    protected void store(String s, OAuth2Authentication oAuth2Authentication) {

    }

    @Override
    protected OAuth2Authentication remove(String s) {
        return null;
    }
}
