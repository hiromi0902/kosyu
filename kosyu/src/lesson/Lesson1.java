package lesson;

//Scannerクラスを使用するために読み込む
import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		
		System.out.println("aの数字を入力してください。");
		
		//Scannerクラスを初期化する
		Scanner Scan= new Scanner(System.in);
		//入力を受付ける部分
	     int a = Scan.nextInt();
		
		System.out.println("bの数字を入力してください。");
	     int b = Scan.nextInt();
		
		 int c =a+b;
		 
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println("c="+"a"+"+"+"b");
		 System.out.println("c="+c);
		 System.out.println("c=c+1");
		 System.out.println("c="+c+1);
	}

}