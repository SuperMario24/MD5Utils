package com.example.saber.md5utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by saber on 2017/7/13.
 */

public class MD5Utils {

    public static String toMD5(byte[] bytes){


        try {
            //实例化一个指定摘要算法的MD5的MessageDigest对象
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //重置摘要以供再次使用
            messageDigest.reset();
            //使用bytes更新摘要
            messageDigest.update(bytes);

            //使用指定的byte数组对摘要进行最后更新，然后完成摘要计算
            return toHexString(messageDigest.digest(),"");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;

    }

    //将字符串中的每个字符转换为十六进制
    public static String toHexString(byte[] bytes, String s) {

        StringBuilder hexString = new StringBuilder();
        for (byte b:bytes){
            String hex = Integer.toHexString(0xff & b);
            if(hex.length() == 1){
                hexString.append('0');
            }
            hexString.append(hex).append(s);
        }
        return hexString.toString();
    }

}
