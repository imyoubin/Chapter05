package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
		
		//UTF-8 파일로 해석되어서 파일은 MS949형식		
		//주 스트림
		Reader fre = new FileReader("C:\\javaStudy\\MS949.txt");
		//보조 스트림
		BufferedReader fr = new BufferedReader(fre);
		
		System.out.println("------------------------스트림 준비완료");
		
		//스트림 읽기
		while(true) {
			String str = fr.readLine();
			if(str==null) {
				System.out.println("------------------------스트림 끝");
				break;
			}
			System.out.println(str);
		}
		
		//스트림 종료
		fr.close();
		System.out.println("------------------------스트림 종료");
	}

}
