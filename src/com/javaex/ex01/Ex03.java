package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		/*
		InputStream i = new InputStream("C:\\JavaStudy\\img.jpg");
		i.read();
		FileInputStream n = new FileInputStream("C:\\JavaStudy\\img.jpg");
		n.read();
		*/
		
		//주 스트림
		InputStream in = new FileInputStream("C:\\JavaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\Bufferedimg.jpg");
		
		//보조 스트림-->주 스트림과 함께 사용
		 BufferedInputStream bin = new BufferedInputStream(in);
		 BufferedOutputStream bout = new BufferedOutputStream(out);
		 
		 System.out.println("스트림준비완료");
		 System.out.println("복사시작");
		 
		 while(true) {
			//int data = in.read();	//사용X
			 int data = bin.read();			 
			 //-1이면 끝
			 
			 if(data==-1) {
				System.out.println("복사끝"); 
				break;
			 }
			 //out.write(data);	//사용X
			 bout.write(data);
		 }
		 bin.read();
		 
		//스트림종료
		bin.close();
		bout.close();
		System.out.println("스트림종료");		

	}

}
