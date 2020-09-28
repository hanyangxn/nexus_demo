package com.hy.nexus.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hy
 * @description:
 * @date 2020/09/28
 */
@Component
public class CronJobsController {
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    //每隔三秒执行一次任务
//    @Scheduled(fixedRate = 3000)
//    public void cronJobs(){
//        System.out.println("时间为："+dataFormat.format(new Date()));
//    }
}
