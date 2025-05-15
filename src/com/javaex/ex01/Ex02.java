package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		//스트림준비
		InputStream in = new FileInputStream("C:\\JavaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\uperimg.jpg");
		System.out.println("스트림준비완료");
		byte[] uper = new byte[1024];
		
		System.out.println("복사시작");
		//반복
		while(true) {
		//읽기
			//int data=in.read();	
			int data=in.read(uper);					
			System.out.println(data);
		if(data==-1) {
			System.out.println("읽기끝(-1)");
			break;
		}					
		//쓰기
		out.write(uper);
		}							
		//스트림 종료 : 빨대회수
		in.close();
		out.close();
			System.out.println("프로그램종료");
			}
		}