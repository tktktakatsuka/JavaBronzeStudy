import java.util.Calendar;
import java.util.Scanner;

public class Quiz {

	private static final String SECOND = null;

	public static void main(String[] args){

		//日付を格納する変数を作成
		int year;
		int month;
		int date;
		int hour;
		int minute;
		int second;
		int day_week;


		//曜日表示用に、曜日文字列を格納する配列の作成
		String youbi[] = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};

		//Calendar　オブジェクトの取得
		Calendar cal = Calendar.getInstance();

		year = cal.get(cal.YEAR);
		month = cal.get(cal.MONTH);
		date = cal.get(cal.DATE);
		hour = cal.get(cal.HOUR);
		minute = cal.get(cal.MINUTE);
		second = cal.get(cal.SECOND);
		//戻り値は数字で月曜日→　1		
		day_week = cal.get(cal.DAY_OF_WEEK)-1;

		//日付を出力
		System.out.println(year+"年"+ month+"月"+date + "日"+ hour + "時"+ minute + "分"+ second + "秒"+ youbi[day_week]);
		System.out.println("------------------------------------------");

		try {
			Scanner sc = new Scanner(System.in);
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str[][] = {{"問題1 このホームページのタイトルは?","1.HP作成講座","2.はじめてのJava入門","3.CGI対策講座","2"},
					{"問題2 管理人のハンドルネームは?","1.たけはる","2.たける","3.たけりん","1"},
					{"問題3 管理人の好きなプロ野球チームは？","1.ソフトバンクホークス","2.西武ライオンズ","3.千葉ロッテマリンーズ","1"},
					{"問題4 管理人の出身地は?","1.東京","2.大阪","3.福岡","3"},
					{"問題5 管理人の誕生日は？","1.1968年9月3日","2.1971年11月18日","3.1987年2月27日","2"}}; 


			System.out.println("■■■三択クイズの開始です  5問あります。■■■");

			int count = 0;
			for(int i = 0; i< str.length;i++){  

				System.out.println(str[i][0]);
				System.out.println(str[i][1]);
				System.out.println(str[i][2]);
				System.out.println(str[i][3]); 
				System.out.println("クイズの答えは？");

				int in1 = sc.nextInt();
				
				int in2 = Integer.parseInt(str[i][4]);

				if(in1 == in2) {
					System.out.println("");
					System.out.println("★★★  大正解です   ★★★");
					System.out.println("");
					count ++;
					
				}else if(in1 > 3){
					System.out.println("");
					System.out.println("1 から 3の数字で答えてください");
					System.out.println("");    i--;
				}else {
					System.out.println("");
					System.out.println("★★★   残念！はずれです   ★★★");
					System.out.println("");
				}
				switch(count) {
				case 0:
					System.out.println("あなたの得点  ： 0点");
					break;
				case 1:
					System.out.println("あなたの得点  ： 1点");
					break;
				case 2:
					System.out.println("あなたの得点  ： 2点");
					break;
				case 3:
					System.out.println("あなたの得点  ： 3点");
					break;
				case 4:
					System.out.println("あなたの得点  ： 4点");
					break;
				case 5:
					System.out.println("あなたの得点  ： 5点");
					break;
				
				}
			}
		}catch(NumberFormatException e){
			System.out.println("数字を入力してください");
		}
	}
}

