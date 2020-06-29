package com.laocaifeng.springboot_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private JedisPool jedisPool;

    @Test
    void contextLoads() {
        Jedis jedis = jedisPool.getResource();
        jedis.set("a","1");
        jedis.set("b","2");
        System.out.println(jedis);
        jedis.sadd("c","a","1","啊是擦");
        System.out.println(jedis);


        redisUtil.set("1","1");
        redisUtil.get("1");

    }

}
