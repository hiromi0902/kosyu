package lesson;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {

		//Scannerクラスを初期化する
		Scanner Scan= new Scanner(System.in);

		System.out.println("年齢を入力してください。");
		//入力を受付ける部分
		int nenrei = Scan.nextInt();


		if (0==nenrei) {
			System.out.println("100円");

		}else if(0!=nenrei) {
			System.out.println("500円");
		}

	}

}