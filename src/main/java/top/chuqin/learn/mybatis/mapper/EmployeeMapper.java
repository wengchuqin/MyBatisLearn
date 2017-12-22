package top.chuqin.learn.mybatis.mapper;

import top.chuqin.learn.mybatis.domain.Employee;

import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public interface EmployeeMapper {
    Employee selectEmployeeById(Integer id);
    List<Employee> selectEmployeeByIdLike(Map<String, Object> params);
    void updateEmployeeIfNecessary(Employee employee);
    List<Employee> selectEmployeeIn(List<Integer> ids);
    List<Employee> selectEmployeeIn(Map<String, Object> params);
    List<Employee> selectEmployeeLikeLoginname(Map<String, Object> params);
}
