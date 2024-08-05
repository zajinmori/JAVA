package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ScoreDAO {

	private final String PATH = ".\\dat\\score.txt"; //따로 멤버로 빼놓는다. 왜? 다른데서도 쓰기 때문에
	
	public void add(ScoreDTO dto) {
		
		try {
			
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(PATH,true)); //(,true를 붙이면 이어쓰기 가능)
			
			//홍길동,100,90,80
			String line = String.format("%s,%d,%d,%d\n", dto.getName(), dto.getKor(), dto.getEng(),dto.getMath());
			
			writer.write(line); //성적 추가
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("ScoreDAO.add");
			e.printStackTrace();
		}
		
		
	}

	public ScoreDTO get(String name) {//데이터실무자
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = null;
			
			while((line = reader.readLine())!=null) {
				
				if(line.startsWith(name)) {// 이름찾기
					
					String[] temp = line.split(","); //쪼개기
					
					ScoreDTO dto = new ScoreDTO();
					
					dto.setName(temp[0]);
					dto.setKor(Integer.parseInt(temp[1]));
					dto.setEng(Integer.parseInt(temp[2]));
					dto.setMath(Integer.parseInt(temp[3]));
					
					return dto;
					
				}
				
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("ScoreDAO.get");
			e.printStackTrace();
		}
		
		
		return null;
	}

	public void edit(ScoreDTO dto) {
		
		try {
			
			//기존 점수 > 수정
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = null;
			String temp = ""; //누적변수
			
			while((line = reader.readLine())!=null) {
				
				if(!line.startsWith(dto.getName())) {
						temp += line + "\r\n";
					}else {
						temp += String.format("%s,%d,%d,%d\r\n"
								,dto.getName()
								,dto.getKor()
								,dto.getEng()
								,dto.getMath());
					}
				
			}
			
			
			reader.close();
			
			//수정된 내용으로 덮어쓰기
			BufferedWriter writer
			= new BufferedWriter(new FileWriter(PATH));//true를 없애면 덮어쓰기 가능
			
			writer.write(temp);
			
			writer.close();
			
			
			
		} catch (Exception e) {
			System.out.println("ScoreDAO.edit");
			e.printStackTrace();
		}
		
		
	}

	public void remove(ScoreDTO dto) {
		
		try {
			
			//기존 점수 > 수정
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = null;
			String temp = ""; //누적 변수
			
			while ((line = reader.readLine()) != null) {
				
				if (!line.startsWith(dto.getName())) {
					temp += line + "\r\n";
				}
				
				
			}
			
			reader.close();
			
			//수정된 내용 > 덮어쓰기
			BufferedWriter writer 
			= new BufferedWriter(new FileWriter(PATH));
			
			writer.write(temp);
			
			writer.close();
			
	
		} catch (Exception e) {
			System.out.println("ScoreDAO.remove");
			e.printStackTrace();
		}
		
	}
	
	

}





















