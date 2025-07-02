package com.pan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.security.Key;

@SpringBootTest
public class lettureTest {

    @Autowired
    //private RedisTemplate<String, Object> redisTemplate;
    //约定 : Key 是字符串，value也是字符串
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        //需求： name: PJY
        stringRedisTemplate.opsForValue().set("name", "PJY");


        System.out.printf(stringRedisTemplate.opsForValue().get("name"));

        //操作string
        //template.opsForValue().xx()j
        //操hash
        //tempLate.opsForHash().xx()j
        //操作List
        //template.opsForList().xx()j
        //操作set
        //tempLate.opsForSet().xx()j
        //操作zset
        //template.opsForzSet().xx()j

        //操作技巧：spring-data-redis api 方法 是 redis 命令方法的全称

//        stringRedisTemplate.opsForList().rightPush()

//        stringRedisTemplate.keys("*");
//        stringRedisTemplate.hasKey("xxx");


    }


}
