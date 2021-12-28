package com.atguigu.jdbc.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("180.76.136.73",6379);
        System.out.println(jedis.ping());
    }
}
