package com.atguigu.bean;


import java.util.HashMap;

/**
 * Created by 渝B on 2020/2/7.
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","lis");
        map.put("age","12");

        String age = map.get("age");
        String name = map.get("name");
        System.out.println("name = " + name);

        map.remove("name");
        System.out.println(map);
    }
}
