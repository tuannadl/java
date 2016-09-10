package tuana;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import helloworld.BeginClass;

public class TuanNguyen {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String path = "E:\\ExportJava\\text.txt";
		BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		try {
			String text = r.readLine();
			int x = Integer.parseInt(text);
			text = r.readLine();
			int y = Integer.parseInt(text);
			TuanNguyen sumt = new TuanNguyen();
			System.out.println(sumt.sum(x, y));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int sum(int a, int b) {
		return a + b;
		// System.out.println("_a : "+a+" _b:"+b);
	}
	
}
