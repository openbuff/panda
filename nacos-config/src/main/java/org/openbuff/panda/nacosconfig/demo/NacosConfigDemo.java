package org.openbuff.panda.nacosconfig.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RefreshScope
public class NacosConfigDemo {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @PostConstruct
    public void init() {
        System.out.printf("[init] user name ：%s , age : %d%n", name, age);
    }

    @RequestMapping("/user")
    public void user() {
        System.out.printf("[init] user name ：%s , age : %d%n", name, age);
    }
}
