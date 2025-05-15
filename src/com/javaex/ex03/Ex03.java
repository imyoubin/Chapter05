package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * •PhoneDB.txt 파일을 한줄씩 읽는다(UTF-8방식으로 저장되어 있음)		 *
		 * 이효리,010-2222-3333,031-2323-4441 를","로 구분함-->배열
		   정우성,010-2323-2323,02-5555-5555 를","로 구분함-->배열
		   이정재,010-9999-9999,02-8888-8888 를","로 구분함-->배열
		 * [이효리],[010-2222-3333],[031-2323-4141]String[] ... = a.split(",");사용
		 * 문제에 있는 형식으로 출력
		 */
		/*
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
        InputStreamReader isr = new InputStreamReader(in, "UTF-8");
        BufferedReader bre = new BufferedReader(isr);

        
        while (true) {
            String str = bre.readLine();

            if (str==null) {
                ;
                break;
            }
            
            String[] parts = str.split(",");

            if (parts.length == 3) {
                String name = parts[0];
                String hp = parts[1];
                String company = parts[2];
                
                System.out.println(str);
                System.out.println("이름: " + name);
                System.out.println("핸드폰: " + hp);
                System.out.println("회사: " + company);
                System.out.println(); 
            } 
        }

        bre.close();
        */
		
		Reader re = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(re);
		
		while(true) {
			String str =br.readLine();
			if(str==null) {
				break;
			}
			String[] par = str.split(",");
			if(par.length==3) {
				
			}
		}
		br.close();
    }
}