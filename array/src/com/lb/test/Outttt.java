package com.lb.test;

import java.io.*;

public class Outttt {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("1.jpg",true);
////        fos.write(99);
//        byte[] bytes = "d你好sdsdsdsdsdddd".getBytes();
//        fos.write("\r\n".getBytes());
//        fos.write(bytes,0,10);
//        fos.close();
        FileInputStream fis = new FileInputStream("D:\\0.jpg");
//        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
        byte[] b = new byte[1024];
//        StringBuffer str = new StringBuffer();
        int len;
        // 循环读取
        while ((len = fis.read(b)) != -1) {
            fos.write(b);
        }
//        System.out.println(str.toString());
        fis.close();
        fos.close();
//        br.close();
    }
}
