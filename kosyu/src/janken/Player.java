package janken;

	import java.util.Random;
import java.util.Scanner;

	public class Player {
		
			public static int inptUserHand() {
				
				System.out.println("あなたの手を決めてください【グー：1、チョキ：3、パー：3】");
				
				Scanner sc= new Scanner(System.in);
				int hand = sc.nextInt();
				sc.close();			
				return hand ;
			}
				
			public static int randompuHand() {
				
				Random r = new Random();
				int hand = r.nextInt(3)+1;
				return hand ;
			}
				
			public static String handName(int hand) {
				
				if(hand == 1) {
					String handName = "グー";
				}else if(hand == 2) {
					String handName = "チョキ";
				}else if(hand == 3){
					String handName = "パー";
				}else {
				return handName ;
				}
				
			}
			
			public static void printHandName(int userHand , int cpuHand) {
				System.out.println("あなたは"+handName(userHand)+"を出しました");
				System.out.println("CPUは"+handName(cpuHand)+"を出しました");
			}
		}
