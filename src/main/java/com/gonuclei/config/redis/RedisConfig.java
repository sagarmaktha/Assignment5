package com.gonuclei.config.redis;

import java.time.Duration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;


@SuppressWarnings("all")
@Configuration
public class RedisConfig {

  @Value("${bizdirect.cache.redis.host}")
  private String redisHostName;

  @Value("${bizdirect.cache.redis.port}")
  private Integer redisPort;

  @Value("${bizdirect.cache.redis.database}")
  private Integer dataBase;

  @Value("${bizdirect.cache.redis.connection-timeout-ms}")
  private Long connectionTimeout;

  @Value("${bizdirect.cache.redis.read-timeout-ms}")
  private Long readTimeOut;

  @Value("${bizdirect.cache.redis.max-wait-millis}")
  private Long maxWait;

  @Value("${bizdirect.cache.redis.max-idle}")
  private Integer maxIdle;

  @Value("${bizdirect.cache.redis.min-idle}")
  private Integer minIdle;

  @Value("${bizdirect.cache.redis.max-idle}")
  private Integer maxTotal;


  @Bean
  JedisPoolConfig jedisPoolConfig() {
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxWaitMillis(maxWait);
    poolConfig.setMaxIdle(maxIdle);
    poolConfig.setMinIdle(minIdle);
    poolConfig.setMaxTotal(maxTotal);
    poolConfig.setTestOnBorrow(true);
    poolConfig.setTestOnReturn(true);
    poolConfig.setTestWhileIdle(true);
    return poolConfig;
  }

  @Bean
  JedisConnectionFactory jedisConnectionFactory() {

    RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(
            redisHostName,
            redisPort
    );

    configuration.setDatabase(dataBase);
    JedisClientConfiguration clientConfiguration =
            JedisClientConfiguration.builder().usePooling().poolConfig(jedisPoolConfig())
                    .and()
                    .connectTimeout(Duration.ofMillis(connectionTimeout))
                    .readTimeout(Duration.ofMillis(readTimeOut))
                    .build();

    return new JedisConnectionFactory(configuration, clientConfiguration);

  }

  @Bean
  RedisTemplate<String, Object> redisTemplate() {
    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(jedisConnectionFactory());
    return redisTemplate;
  }

}