package lesson;

import java.util.Scanner;

public class Lesson7 {

	public static void main(String[] args) {

	System.out.println("a=0");
	System.out.println("b=0");

	System.out.println("aに入る数字を入力してください。");

	//数字入力
	Scanner Scan1= new Scanner(System.in);
	int a = Scan1.nextInt();

	System.out.println("bに入る数字を入力してください。");


	//数字入力
	Scanner Scan2= new Scanner(System.in);
	int b = Scan2.nextInt();

	for(int i=0;i < 3;i++){

		if(a<b){
		//aがbより小さい

		b=b+1;
		System.out.println("a="+a+","+"b="+b+","+"i="+","+i);

		}
		else{
		//それ以外

		a=a+1;
		System.out.println("a="+a+","+"b="+b+","+"i="+","+i);
		}
	}
	}
}