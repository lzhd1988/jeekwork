package com.jeek.work.week05.subject2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: mayu
 * @Date: 2021-10-24 23:00
 * @Description: 写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub
 * @Version: 1.0
 */
@Configuration
public class JavaBeanConfigration {

    @Bean
    public Student getStudent(){
        return new Student();
    }
}
