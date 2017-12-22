package top.chuqin.learn.mybatis.domain;

import java.util.List;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class Article {
    private Integer id;
    private String name;
    private Double price;
    private List<Order> orders;

    public Article() {
    }

    public Article(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
