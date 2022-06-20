
 class SuperClass {
	 
	void methodA() {
		System.out.println("Super");
	}
	void methodB(int a) {	
	}
	int methodC(int a,int b) {
		return 0;
	}
	int methodD(int a) {
		return 0;
	}

}

class SubClass extends SuperClass{
	
	public void methodA() {
		super.methodA();
		System.out.println("Sub");
	}
	
	public int methodD(int i) {
		return 1;
	}
}

public class Main_6{
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.methodA();
	}
	
}