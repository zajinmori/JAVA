package com.test.java.SELF;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ScoreDAO2 {
	
	private final String PATH = ".\\dat\\score.txt";
	
	public void add(ScoreDTO2 dto) {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(PATH,true));
			
			String line = String.format("%s,%d,%d,%d\n", dto.getName(), dto.getKor(), dto.getEng(), dto.getMath());
			
			writer.write(line);
			
			writer.close();
			
			
			
			
		} catch (Exception e) {
			System.out.println("ScoreDAO2.add");
			e.printStackTrace();
		}
		
		
		
	}
	
	public ScoreDTO2 get(String name) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = null;
			
			while((line = reader.readLine())!=null) {
				if(line.startsWith(name)) {
					String[] temp = line.split(",");
					ScoreDTO2 dto = new ScoreDTO2();
					
					dto.setName(temp[0]);
					dto.setKor(Integer.parseInt(temp[1]));
					dto.setEng(Integer.parseInt(temp[2]));
					dto.setMath(Integer.parseInt(temp[3]));
					
					return dto;
				
				}
			}
			reader.close();
			
			
			
		} catch (Exception e) {
			System.out.println("ScoreDAO2.get");
			e.printStackTrace();
		}
		return null;
			
	}
	
	public void edit(ScoreDTO2 dto) {
		
		try {
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("ScoreDAO2.edit");
			e.printStackTrace();
		}
		
		
	}
	
	

}
