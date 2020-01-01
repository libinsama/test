package com.lb.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readerr {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\b.txt");
        int len;
        char[] b= new char [2];
        while ((len = fr.read(b)) != -1) {
            System.out.print(new String(b,0,len));
        }
        fr.close();
    }
}
