package com.jeek.work.normal;

/**
 * @Author: mayu
 * @Date: 2021-10-11 17:29
 * @Description:
 * @Version: 1.0
 */
public class NumberUtil {


    public static void main(String[] args) {
        int total = 50;
        int size = 3;
        int sendNum = total%size == 0? total/size : total%size + 1;
        System.out.println("sendNum1:"+sendNum);


        total = 21;
        size = 3;
        sendNum = total%size == 0? total/size : total%size + 1;
        System.out.println("sendNum2:"+sendNum);
    }
}
