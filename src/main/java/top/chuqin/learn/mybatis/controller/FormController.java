package top.chuqin.learn.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@Controller
public class FormController {

    /**
     * 动态跳转页面
     * @param formName
     * @return
     */
    @RequestMapping("/{formName}.action")
    public String loginForm(@PathVariable String formName){
        return formName;
    }
}
