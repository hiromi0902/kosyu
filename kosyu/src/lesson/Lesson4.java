package lesson;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {

		//入力部分

		Scanner Scan1= new Scanner(System.in);
		System.out.println("年齢を入力してください。");
		int nenrei = Scan1.nextInt();


		Scanner Scan2= new Scanner(System.in);
		System.out.println("生まれ年(西暦)を入力してください。");
		int seireki = Scan2.nextInt();

		//計算部分

		if(10==nenrei || 2001 == seireki) {
			System.out.println("100円");
		}

		else {
			System.out.println("500円");
		}

}
}