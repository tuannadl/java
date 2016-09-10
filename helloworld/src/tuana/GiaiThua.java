package tuana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import helloworld.DemoDq;

public class GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String text;
		try {
			System.out.println("Nhập vào số tự nhiên");
			text = r.readLine();
			int x = Integer.parseInt(text);
			DemoDq gt = new DemoDq();
			System.out.println("Gai thua cua so do la:: " + gt.giaithua(x));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
