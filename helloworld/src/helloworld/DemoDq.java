package helloworld;

public class DemoDq {
	public int giaithua(int a){
		if(a==1){
			return 1;
		}
		return a*giaithua(a-1);
	}
}
