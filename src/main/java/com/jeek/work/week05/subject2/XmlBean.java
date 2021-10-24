package com.jeek.work.week05.subject2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Author: mayu
 * @Date: 2021-10-24 23:44
 * @Description:
 * @Version: 1.0
 */
@Slf4j
public class XmlBean {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        final Object student = context.getBean("student");
        log.info("student {}", student);

    }
}
