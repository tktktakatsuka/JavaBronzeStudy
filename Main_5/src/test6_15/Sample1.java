package test6_15;

public class Sample1 {
	private int a;
	private int b;
	
	public Sample1(){
		this(10);
	}
	public Sample1(int a) {
		this.a = a;
		this.b = -5;
	}
	void PrintData(){
		System.out.println(a+b);
	}
}
