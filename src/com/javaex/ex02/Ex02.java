package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {
	
	public static void main(String[] args) throws IOException{
		
		//주 스트림
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		
		//보조 스트림
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println("스트림 준비완료");
		
		while(true) {
			String str = bfr.readLine();
			if(str==null) {
				System.out.println("파일읽기 끝");
				break;
				
			}
			System.out.println(str);
		}
		bfr.close();
		System.out.println("스트림 종료");
	}

}
