package janken;

import java.util.Random;
import java.util.Scanner;

	public class Player {

		int userHand ;
		int cpuHand ;

		int gu =1 ;
		int choki =2 ;
		int pa =3 ;


			public int inptUserHand() {

				System.out.println("あなたの手を決めてください【グー：1、チョキ：3、パー：3】");

				Scanner userHand= new Scanner(System.in);
				int hand = userHand.nextInt();
				return hand ;
			}

			public int randompuHand() {

				Random cpuHand = new Random();
				int hand = cpuHand.nextInt(3)+1;
				return hand ;
			}

			public String tohandName(int hand) {

				String handName = "";

				if(hand == 1) {
					handName = "グー";
				}else if(hand == 2) {

					handName = "チョキ";
				}else if(hand == 3){
					handName = "パー";
				}
				return handName ;

			}

			public void  printHandName(int userHand , int cpuHand) {

				System.out.println("あなたは"+tohandName(userHand)+"を出しました");
				System.out.println("CPUは"+tohandName(cpuHand)+"を出しました");
			}
		}