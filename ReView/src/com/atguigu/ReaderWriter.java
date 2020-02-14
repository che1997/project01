package com.atguigu;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 渝B on 2020/2/13.
 */
public class ReaderWriter {
    public static void main(String[] args) {

    }

    @Test
    public void MyTest(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            File file1 = new File("hello1.txt");

            fr = new FileReader(file);
            fw = new FileWriter(file1);

            char[] arr = new char[5];
            int len;
            while ((len = fr.read())!=-1){
                fw.write(arr,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
