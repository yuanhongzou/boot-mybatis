package com.zouyu.bootmybatis.mapping;

import com.zouyu.bootmybatis.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArticleMapper {
    Article getArticleById(Integer id);

    List<Article> getArticleList();

    int add(Article article);

    int update(@Param("id") Integer id, @Param("article") Article article);

    int delete(Integer id);
}
