package lesson;

import java.util.Scanner;

public class Lesson8 {

	public static void main(String[] args) {

		System.out.print("aの値を入力");

		Scanner Scan= new Scanner(System.in);
		int a = Scan.nextInt();


		System.out.print(a+"+1を3回繰り返します。");


		for(;a<=3;a++) {

			System.out.println("aの値は"+a+"です。");
		}

}
}