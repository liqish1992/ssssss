package com.liqisheng.demo.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExceptionResponse {


    @RequestMapping("/helloo")
    public void excep() {
        log.info("by ------------------------------zero exception {}" , 1);
        int i = 10 / 0;
        System.out.println("你是一个好人");

    }

    @RequestMapping("/hello")
    public void exec() {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("你是一个好人");
    }
    @RequestMapping("/hello1")
    public String h() throws Exception{
        int i = 10/0;
        System.out.println("你是一个好人");
        return "hello";
    }
    @RequestMapping("/hello2")
    public String execcccc() {
        try {
            int i = 10/0;
        } catch (Exception e) {
            return e.getMessage();
        }
        System.out.println("你是一个好人");
        return "heelo";
    }
    @RequestMapping("/hello4")
    public void execsds() {
        int i = 10/0;
        System.out.println("你是一个好人");
    }




}
