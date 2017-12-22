package top.chuqin.learn.mybatis.service;

import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Article;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class ArticleServiceTest {

    ArticleService articleService = new ArticleService();

    @Test
    public void testGetArticleListByOrderId() throws Exception {
        List<Article> articleList = articleService.getArticleListByOrderId(2);
        System.out.println(articleList);
    }
}