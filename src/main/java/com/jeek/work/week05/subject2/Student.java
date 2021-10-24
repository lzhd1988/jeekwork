package com.jeek.work.week05.subject2;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: mayu
 * @Date: 2021-10-24 23:14
 * @Description:
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
public class Student {

    private String name;

    private Integer age;

    private Integer sex;

    public String getName(){
        return name;
    }
}
