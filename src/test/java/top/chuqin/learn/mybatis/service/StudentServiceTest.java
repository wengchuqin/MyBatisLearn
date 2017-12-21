package top.chuqin.learn.mybatis.service;

import org.junit.Assert;
import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Student;
import top.chuqin.learn.mybatis.domain.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class StudentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    public void getAllStudentTest() throws IOException {
        List<Student> list = studentService.getAllStudent();
        System.out.println(list);
    }

}
