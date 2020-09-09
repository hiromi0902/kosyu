package lesson;

import java.util.Scanner;

public class Lesson10 {

	public static void main(String[] args) {

	System.out.println("モードを入力してください。（1 or 2）:");

	//モード判定


	Scanner Scan= new Scanner(System.in);
     int mode = Scan.nextInt();

    System.out.println("生まれた年を西暦で入力してください。:");
     int umare = Scan.nextInt();


     //age
     if(mode == 1) {

    	 System.out.println("調べたい年を西暦で入力してください：");;
    	 int year = Scan.nextInt();

    	 int nenrei = year - umare;

    	 System.out.println("西暦"+year+"年の時、あなたは"+nenrei+"歳です");

     }
     //yaer
     else if(mode == 2){

    	 System.out.println("調べたい年齢を入力してください:");
    	 int nenrei = Scan.nextInt();

    	 int year = nenrei + umare;

    	 System.out.println("あなたが"+nenrei+"歳の時は"+year+"年です");
     }
     else {
     System.out.println("正しいモードが入力されていません。もう一度入力してください");
     }

}
}