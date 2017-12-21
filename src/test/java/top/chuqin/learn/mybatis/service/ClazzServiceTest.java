package top.chuqin.learn.mybatis.service;

import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Clazz;

import java.io.IOException;
import java.util.List;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class ClazzServiceTest {
    ClazzService clazzService = new ClazzService();

    @Test
    public void getAllClazzTest() throws IOException {
        List<Clazz> list = clazzService.getAllClazz();
        for(Clazz c : list){
            System.out.println(c);
            System.out.println(c.getStudents());
            System.out.println("----");
        }
    }

    @Test
    public void getBuIdTest() throws IOException {
        Clazz clazz = clazzService.getById();
        System.out.println(clazz);
    }
}
