package org.openbuff.panda.nacosconfig.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class NacosConfigDemo {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @PostConstruct
    public void init() {
        System.out.printf("[init] user name ：%s , age : %d%n", name, age);
    }
}
