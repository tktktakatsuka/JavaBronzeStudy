public class Main {
	public static void main(String[] args) {
		Food f = new Main().new Food("a food");
		f.print();
		
		
	}
	
	class Food{
		public String name;
		
		public Food(String n) {
			name = n;
		}
		public void print() {
			System.out.println(name);
		}
	}
}
