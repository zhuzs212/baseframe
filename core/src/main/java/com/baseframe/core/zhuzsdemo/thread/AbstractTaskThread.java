package com.baseframe.core.zhuzsdemo.thread;

import lombok.Data;

/**
 * 任务线程抽象对象
 *
 * @author zhu_zishuang
 * @date 2021-03-12
 */
@Data
public abstract class AbstractTaskThread implements Runnable {
    /**
     * 线程类型
     */
    ThreadTypeEnum threadTypeEnum;

    /**
     * 执行延时
     */
    Long initialDelay;

    /**
     * 执行周期
     */
    Long period;

    /**
     * 线程标识
     */
    String taskThreadId;
}

