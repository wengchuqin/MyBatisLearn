package top.chuqin.learn.mybatis.mapper;

import top.chuqin.learn.mybatis.domain.Consumer;
import top.chuqin.learn.mybatis.domain.Order;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public interface OrderMapper {
    Order selectOrderById(Integer id);
}
