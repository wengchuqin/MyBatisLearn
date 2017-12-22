package top.chuqin.learn.mybatis.domain;

import java.util.List;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class Order {
    private Integer id;
    private Double total;
    List<Article> articles;

    public Order() {
    }

    public Order(Integer id, Double total, List<Article> articles) {
        this.id = id;
        this.total = total;
        this.articles = articles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", articles=" + articles +
                '}';
    }
}
