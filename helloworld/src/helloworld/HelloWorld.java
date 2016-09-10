package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nguyej anh tuna");
		a();
		B b = new B();
		b.newfunb();
		C c = new C();
		c.newfunb();
		BeginClass bg = new BeginClass();
		bg.heomoi();

	}
	public void newfun(){
		System.out.println("heo");
		a();
	}
	public static void a(){
		System.out.println("heo1");
	}

}
class B{
	public void newfunb(){
		System.out.println("heoB");
		HelloWorld.a();
		HelloWorld h = new HelloWorld();
		h.newfun();
	}
}
class C extends B{
	public void heo(){
		System.out.println("phphhp");
	}
}
