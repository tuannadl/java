package doituong;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	protected String hoten;
	protected int id;
	protected int age;
	public Student(String hoten,int id,int age){
		this.hoten = hoten;
		this.id = id;
		this.age = age;
	}
	
	public static String[][] getFile(String path){
		String returtSt[][] = new String[2][];
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
			int i = 0;
			while(true){
				try {
					String[] arrStudent = new String[4];
					arrStudent[0] =  r.readLine();
					if(arrStudent[0]==null) break;
					arrStudent[1] =  r.readLine();
					arrStudent[2] =  r.readLine();
					arrStudent[3] =  r.readLine();
					returtSt[i] = arrStudent;
					i++;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returtSt;
	}
}
