package com.zouyu.bootmybatis.service.impl;

import com.zouyu.bootmybatis.mapping.ArticleMapper;
import com.zouyu.bootmybatis.model.Article;
import com.zouyu.bootmybatis.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Article getArticleById(Integer id) {
        return articleMapper.getArticleById(id);
    }

    @Override
    public List<Article> getArticleList() {
        return articleMapper.getArticleList();
    }

    @Override
    public int add(Article article) {
        return articleMapper.add(article);
    }

    @Override
    public int update(Integer id, Article article) {
        return articleMapper.update(id,article);
    }

    @Override
    public int delete(Integer id) {
        return articleMapper.delete(id);
    }
}
