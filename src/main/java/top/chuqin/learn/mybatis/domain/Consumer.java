package top.chuqin.learn.mybatis.domain;

import java.util.List;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class Consumer {
    private Integer id;
    private String username;
    private List<Order> orders;

    public Consumer() {
    }

    public Consumer(Integer id, String username, List<Order> orders) {
        this.id = id;
        this.username = username;
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orders=" + orders +
                '}';
    }
}
