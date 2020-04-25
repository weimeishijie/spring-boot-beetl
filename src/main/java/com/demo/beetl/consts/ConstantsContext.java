package com.demo.beetl.consts;

import com.demo.beetl.utils.ValidateUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by li wen ya on 2020/4/25
 * 系统常量的容器
 */
public class ConstantsContext {

    /**
     * 所有的常量，可以增删改查 constnts holder
     */
    private static Map<String, Object> CONSTANTS_HOLDER = new ConcurrentHashMap<>();


    /**
     * 添加系统常量
     */
    public static void putConstant(String key, Object value) {
        if (ValidateUtils.isOneEmpty(key, value)) {
            return;
        }
        CONSTANTS_HOLDER.put(key, value);
    }

    /**
     * 删除常量
     */
    public static void deleteConstant(String key) {
        if (ValidateUtils.isOneEmpty(key)) {
            return;
        }
        CONSTANTS_HOLDER.remove(key);
    }

    /**
     * 获取系统常量值
     */
    public static Object getConstant(String key) {
        if (ValidateUtils.isOneEmpty(key)) {
            return "";
        }
        return CONSTANTS_HOLDER.get(key);
    }

    /**
     * 获取系统常量
     */
    public static Map<String, Object> getConstntsMap() {
        return CONSTANTS_HOLDER;
    }



}
