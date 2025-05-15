package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		//주 스트림
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");
		
		//보조 스트림
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("학교종이 땡땡땡");
		bfw.newLine();
		bfw.write("어서 모이자");
		bfw.newLine();
		bfw.write("선생님이 우리를");
		bfw.newLine();
		bfw.write("기다리신다");
		
		//스트림종료
		bfw.close();
	}

}
