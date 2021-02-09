package com.io;

import java.io.*;
import java.util.Scanner;

public class FirstIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("대상파일: ");
        String src = scanner.nextLine();

        System.out.print("사본이름: ");
        String copy = scanner.nextLine();

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(copy);)
        {
            int data;
            while(true){
                data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
