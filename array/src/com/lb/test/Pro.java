package com.lb.test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Pro {
    public static void main(String[] args) throws FileNotFoundException {
        Properties properties = new Properties();
        properties.setProperty("a","aa");
        properties.setProperty("ad","add");
        properties.setProperty("add","aadd");

        try {
            BufferedReader br = null;
            br = new BufferedReader(new InputStreamReader(new  FileInputStream(new File("d:\\f.txt")), "utf-8"));
            properties.load(br);
//            InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties);
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"---->"+properties.getProperty(string));
        }

    }
}
