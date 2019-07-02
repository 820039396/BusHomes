package com.qf.j1902.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by funkh on 2019/7/2.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
