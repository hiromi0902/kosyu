package janken;

public class Main {

	public static void main(String[] args) {


		//メッセージ
		System.out.println("じゃんけん勝負を始めます(10回勝負)");

		//繰り返し処理
		for (int i = 1; i <= 10; i++){
		System.out.println("--------------------------------");
		System.out.println(i+"回戦目");
		System.out.println("--------------------------------");

		//メイン処理
		Player user = new Player();
		user.inptUserHand();

		Player cpu = new Player();
		cpu.randompuHand();


		//手を表示する
		Player hName = new Player();
		hName.printHandName(userHand , cpuHand);

		//勝敗

		WinLose wl = new WinLose();
		wl.battleHand(userHand , cpuHand);

		}

		System.out.println("--------------------------------");

		//結果

		System.out.println("★最終結果★");
		System.out.println("勝"+"敗"+"あいこでした");

	}

		//勝敗結果
}