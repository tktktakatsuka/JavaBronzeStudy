public class Main_11 {
	private String name;
	private int price;
	public String TMP = "sample";
	public Main_11() {
		this("sample");
		this.price = 100;
		
	}
	public Main_11(String name) {
		this.name =name;
		
	}
	public void print() {
		System.out.println(name + ":" + price);
	}
	public static void main(String[] args) {
		Main_11 s = new Main_11();
		s.print();
		
	}
	

}
