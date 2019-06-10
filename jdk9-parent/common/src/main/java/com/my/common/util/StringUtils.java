package com.my.common.util;

/**
 * 字符串工具类
 *
 * @author feb13th
 * @since 2019/4/11 20:04
 */
public class StringUtils {

    /**
     * 判读给定对象是否为null
     *
     * @param arg 字符串
     * @return 是否是null
     */
    public static boolean isNull(String arg) {
        return arg == null;
    }

    /**
     * 判断给定字符串是否是null 或者 ""
     *
     * @param arg 字符串
     * @return 是否是空串
     */
    public static boolean isEmpty(String arg) {
        return !isNull(arg) && !"".equals(arg.trim());
    }


}
