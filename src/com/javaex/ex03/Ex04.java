package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * Person 사용해서 만들것
		//반복
		PhoneDB.txt 파일을 한줄씩 읽는다, (UTF-8방식으로 저장되어 있음)		
		"이효리,010-2222-3333,031-2323-4441"  을 "," 로 구분한다.  -->배열		
		//반복
		====>리스트에 정리
		[0x111] [0x3333] [0x888]		
		0x111  name = 이효리,  hp= 010-2222-3333, company=031-2323-4441  ==>Person		
		for으로 출력
		문제에 있는 형식으로 출력한다		
		*/
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
        InputStreamReader isr = new InputStreamReader(in, "UTF-8");
        BufferedReader bre = new BufferedReader(isr);

       
        while (true) {
            String str = bre.readLine();

            if (str==null) {
                ;
                break;
            }            
            
            //System.out.println(str);
            //System.out.println(str.toString());
            
            String[] parts = str.split(",");
            String name = parts[0];
            String hp = parts[1];
            String company = parts[2]; 
            System.out.println(str.toString());                                  
        }
        bre.close();      
    }
}
