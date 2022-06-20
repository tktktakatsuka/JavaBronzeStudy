package test6_17;

public class test {
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("sample");
		System.out.println(item.getName());
	}
}
class Item{
	private String name;

	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name = name;

	}
}


