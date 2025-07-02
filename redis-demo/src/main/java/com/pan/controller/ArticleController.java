package com.pan.controller;

import com.pan.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    ArticleServiceImpl articleService;

    @RequestMapping(value = "/incr", method = RequestMethod.POST)
    public Integer incr(int id) {
        return articleService.incr(id);
    }

}
