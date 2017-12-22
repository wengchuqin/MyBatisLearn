package top.chuqin.learn.mybatis.service;

import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Clazz;
import top.chuqin.learn.mybatis.domain.Person;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class ClazzServiceTest {
    ClazzService personService = new ClazzService();


    @Test
    public void getByIdTest(){
        Clazz clazz = personService.selectClazzById(1);
        System.out.println(clazz.getCode());

        //这里居然发出了查询语句！！！
        //明明没有打印students
        //？？？
        System.out.println(clazz);
    }


}
