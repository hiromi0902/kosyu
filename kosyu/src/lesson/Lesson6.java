package lesson;

public class Lesson6 {

	public static void main(String[] args) {

		//預金額
		int yokin = 10000;

		//開始0年
		int year=1;

		do {
			System.out.println(year + "年後は、預金"+yokin+"円です。");
			year++;
			yokin *=1.1;
		}while(year < 4);

	}

}