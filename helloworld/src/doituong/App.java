package doituong;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String path = ;
		String path = "E:\\ExportJava\\text.txt";
		String[][] arr = Student.getFile(path);
		for (int i = 0; i < arr.length; i++) {
			String[] arrTemp = arr[i];
			for (int j = 0; j < arrTemp.length; j++) {
				System.out.println(arrTemp[j]);
			}
		}
		// foreach
		for (String[] arrTemp : arr) {
			for (String x : arrTemp) {
				System.out.println(x);
			}
		}
		
	}
}
