package com.hr.controller;

import com.hr.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/14
    Time: 9:56
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Controller
public class HelloController {
    /*@Autowired
    private Environment environment;
*/
    /*@Value("${name}")
    private String name;
    @Value("${url}")
    private String url;*/

    @RequestMapping("/hello")
    public String hello(Model model, String username){
     //  return "hello springboot  name"+environment.getProperty("name")+"---url"+environment.getProperty("url");
    //   return "name:"+name+",url"+url;

       /* model.addAttribute("username",username);
        model.addAttribute("content","<h1>hello thymeleaf<h1>");
        return "index";*/
        List<Person> personList = new ArrayList<>();
            personList.add(new Person("zhangsan","12333"));
            personList.add(new Person("zhangsan","12333"));
            personList.add(new Person("zhangsan","12333"));
            personList.add(new Person("zhangsan","12333"));
            model.addAttribute("personList",personList);

            Map<String,String> map = new HashMap<>();
            map.put("name","张三");
            map.put("pwd","123");
            map.put("sex","男");
            map.put("age","20");
            map.put("phone","11122223333");
            model.addAttribute("map",map);

            String[] names = {"张三","李四","王五","赵六"};
            model.addAttribute("names",names);
            return "index";

    }

}