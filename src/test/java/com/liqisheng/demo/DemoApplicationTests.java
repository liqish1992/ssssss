package com.liqisheng.demo;

import com.liqisheng.demo.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Test
    void contextLoads() {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());

        String[] s = {"sdf", "asdf", "accca", "bb"};
        Arrays.stream(s).distinct().forEach(System.out::println);
        System.out.println(".....................");
        Arrays.stream(s).sorted().forEach(System.out::println);
        System.out.println(".....................");
        Arrays.stream(s).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
