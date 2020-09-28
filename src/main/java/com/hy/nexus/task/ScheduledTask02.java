package com.hy.nexus.task;

/**
 * @author hy
 * @description:
 * @date 2020/09/28
 */
import com.hy.nexus.service.ScheduledTaskJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 任务 01
 */
public class ScheduledTask02 implements ScheduledTaskJob {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask02.class);

    @Override
    public void run() {
        LOGGER.info("ScheduledTask => 02  run  当前线程名称 {} ", Thread.currentThread().getName());
    }
}

