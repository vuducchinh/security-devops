package com.example.demo.config;

//import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.util.ObjectUtils;
//
//import java.time.Duration;

//@Configuration
//@EnableRedisHttpSession
public class RedisConfig {
    private String host;
    private int port;
    private String userName;
    private String password;
    private int minIdle;
    private int maxIdle;
    private int maxActive;
    private int maxWait;
    private long timeBetweenEvictionRuns;

//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName(host);
//        redisStandaloneConfiguration.setPort(port);
//
//        if (!ObjectUtils.isEmpty(password)) {
//            redisStandaloneConfiguration.setPassword(password);
//        }
//        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
//        poolConfig.setMinIdle(minIdle);
//        poolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRuns);
//        poolConfig.setMaxIdle(maxIdle);
//        poolConfig.setMaxTotal(maxActive);
//        poolConfig.setMaxWait(Duration.ofMillis(maxWait));
//
//        LettuceClientConfiguration clientConfiguration = LettuceClientConfiguration.builder().build();
//        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration, clientConfiguration);
//
//        return lettuceConnectionFactory;
//    }

//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory());
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//
//        return redisTemplate;
//    }
}
