package top.chuqin.learn.mybatis.mapper;

import top.chuqin.learn.mybatis.domain.Consumer;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public interface ConsumerMapper {
    Consumer selectConsumerById(Integer id);
}
