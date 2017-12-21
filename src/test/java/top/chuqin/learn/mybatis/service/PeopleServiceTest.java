package top.chuqin.learn.mybatis.service;

import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Person;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class PeopleServiceTest {
    PersonService personService = new PersonService();


    @Test
    public void getByIdTest(){
        Person p = personService.selectPeopleById(1);
        System.out.println(p);
    }


}
