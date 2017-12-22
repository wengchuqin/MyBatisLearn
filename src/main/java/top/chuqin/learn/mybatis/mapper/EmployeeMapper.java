package top.chuqin.learn.mybatis.mapper;

import top.chuqin.learn.mybatis.domain.Employee;

import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public interface EmployeeMapper{
    Employee selectEmployeeById(Integer id);
    void updateEmployeeIfNecessary(Employee employee);
}
