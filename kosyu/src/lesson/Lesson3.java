package lesson;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		//Scannerクラスを初期化する
		Scanner Scan= new Scanner(System.in);
		System.out.println("年齢を入力してください。");
		//入力を受付ける部分
		int nenrei = Scan.nextInt();
		
		//12歳以下は無料
		if(12 > nenrei) {
			System.out.println("無料");
		}
		//15歳以下は300円
		else if ((15 > nenrei)&&(12 < nenrei)) {
			System.out.println("300円");
		}
		
		//16歳以上は500円
		else if (15 <= nenrei ) {
			System.out.println("500円");
		}

	}

}