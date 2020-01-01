package com.lb.test;

import java.io.File;
import java.io.IOException;

public class Filee {
    public static void main(String[] args) {
        File file = new File("d:\\c");
        File file1 = new File("d:\\c\\ssss1.java");
        File file2 = new File("d:\\c\\ssss2.java");
        File file3 = new File("d:\\c\\ssss3.java");
        File file5 = new File("d:\\c\\d");
        File file6 = new File("d:\\c\\d\\b.java");
        mk(file);
        mk(file5);
        create(file1);
        create(file2);
        create(file3);
        create(file5);
        create(file6);
        File file4 = new File("d:\\c");
        printt(file4);

    }

    public static void create(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void mk(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void printt(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f.getName() + "Dir.............");
                printt(f);
            } else if (f.isFile()) {
                System.out.println(f.getName() + "fil..........");
            }
        }
    }
}
