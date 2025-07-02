package com.pan.service.impl;

import com.pan.service.IArtcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements IArtcleService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Integer incr(int id) {
//        唯一 可读 灵活，时效
        String key = "article_viewNum:" + id;
        Long increment = stringRedisTemplate.opsForValue().increment(key);
        return increment.intValue();
    }
}
