/**
 * 階乗を求めます(例外を受け取る)。
 */
public class Main {
	
	/**
	 * メインメソッド。
	 * @param args 引数
	 */
	public static void main(String[] args) {
		System.out.println("-3の階乗を求めます。");
		
		try {
			long value = Main.factorial(-3);
			System.out.println("値は " + value + "です。");
		} catch(IllegalArgumentException e) {
			System.out.println("異常が発生しました。");
		}
	}
	
	/**
	 * 指定した数の階乗を求めます。なお、0以下の値を指定した場合、例外を発生します。
	 * @param number 数
	 * @return 階乗の値
	 */
	private static long factorial(int number) {
		if(number <= 0) {
			throw new IllegalArgumentException();
		} else {
			long value = 1;
			for(int i = number; i >=1 ; i --) {
				value *= i;
			}
			
			return value;
		}
	}
}