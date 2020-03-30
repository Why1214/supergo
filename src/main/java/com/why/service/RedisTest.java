package com.why.service;

import redis.clients.jedis.Jedis;

import java.time.LocalDate;

public class RedisTest {
    public static void main(String[] args) {
//        Jedis jedis = new Jedis("116.63.132.115", 6379);
//        jedis.set("aaa", "bbb");
//        String aaa = jedis.get("aaa");
//        System.out.println("-------------:" + aaa);
//        jedis.close();

        String s = LocalDate.now().plusDays(1).toString();
        System.out.println(s);
    }

}
