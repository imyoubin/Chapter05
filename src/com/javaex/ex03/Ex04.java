package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		
        //리스트 만들기
        List<Person> plist = new ArrayList<Person>();
        
        //스트림 준비
        Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		 //반복문(파일 끝까지)		
		while(true) {
			//파일에서 1줄(이효리)를 읽는다
			String str = br.readLine();	//"이효리" "010-2222-3333" "031-2323-4441"
			
			//마지막으면 끝
			if(str==null) {
				break;
			}
			System.out.println(str);
			
			//읽어올때 이름 hp company로 분리한다 
			//"정우성,010-2323-2323,02-5555-5555" --> "이효리" "010-2222-3333" "031-2323-4441"
			String[] sArray = str.split(",");
			
			System.out.println(sArray[0]);	//이름
			System.out.println(sArray[1]);	//핸드폰
			System.out.println(sArray[2]);	//회사
			System.out.println("---------------------------");
			String name = sArray[0];
            String hp = sArray[1];
            String company = sArray[2];
            
            //Person을 메모리에 올린다
            Person n = new Person(name, sArray[1], sArray[2]);
            
            //Person주소를 list에 넣는다
            plist.add(n);          
					
		}
		//테스트
		System.out.println("-------테스트--------------");
		System.out.println(plist.toString());
		//출력
		System.out.println("--------출력---------------");
		for(int i=0;i<plist.size();i++ ) {
			System.out.println(plist.get(i).toString());	
		}
		//이름만 출력
		System.out.println("-------이름만 출력-------------");
		for(int i=0;i<plist.size();i++ ) {
			System.out.println(plist.get(i).getName());				
		}
		//첫번째 사람의 이름, 핸드폰
		System.out.println("---첫번째 사람의 이름, 핸드폰--------------------");
		/*
		System.out.println(pList.get(0).getName());
		System.out.println(pList.get(0).getHp());
		*/
		Person p00= plist.get(0);
		System.out.println(p00.getName());
		System.out.println(p00.getHp());
		
		//스트림 종료		
        br.close();
                
    }
}
