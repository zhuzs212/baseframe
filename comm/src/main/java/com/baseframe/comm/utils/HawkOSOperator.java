package com.baseframe.comm.utils;

import java.util.Properties;

/**
 * 判断当前系统类型
 *
 * @author zhu_zishuang
 * @date 2021/10/8
 */
public class HawkOSOperator {
    /**
     * 判断windows系统
     *
     * @return
     */
    public static boolean isWindowsOS() {
        Properties props = System.getProperties();
        if (props.getProperty("os.name").toLowerCase().contains("windows")) {
            return true;
        }
        return false;
    }

    /**
     * 判断linux系统
     *
     * @return
     */
    public static boolean isLinuxOS() {
        Properties props = System.getProperties();
        if (props.getProperty("os.name").toLowerCase().contains("linux")) {
            return true;
        }
        return false;
    }

    /**
     * 判断mac系统
     *
     * @return
     */
    public static boolean isMacOS() {
        Properties props = System.getProperties();
        if (props.getProperty("os.name").toLowerCase().contains("mac")) {
            return true;
        }
        return false;
    }
}
