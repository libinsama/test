package com.lb.test;

import java.io.FileWriter;
import java.io.IOException;

public class Writerr {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\f.txt",true);
        String str = "dsdsdsds我是你爸爸";
        fw.write(str,8,5);

    }
}
