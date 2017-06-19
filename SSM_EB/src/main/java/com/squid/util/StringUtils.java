package com.squid.util;
import java.util.UUID;

/**
 * @author Squid
 *  string工具类
 */
public class StringUtils {

    /**
     * 获取uuid
     * @return
     */
    public static String getUUId(){
        String id = UUID.randomUUID().toString().replaceAll("-","");
        return id;
    }

}