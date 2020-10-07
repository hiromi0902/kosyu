package janken;

public class WinLose extends Player {

	//定義

	int gu =1 ;
	int choki =2 ;
	int pa =3 ;

	int userHand;
	int cpuHand;

			public void battleHand(int userHand , int cpuHand) {


			if( userHand == gu && cpuHand == choki ) {
					System.out.println("あなたが勝ちました");
				}else if(userHand == choki && cpuHand == pa) {
					System.out.println("あなたが勝ちました");
				}else if(userHand == pa && cpuHand == gu) {
					System.out.println("あなたが勝ちました");
				}else if(userHand == gu && cpuHand == pa) {
					System.out.println("CPUが勝ちました");
				}else if(userHand == choki && cpuHand == gu) {
					System.out.println("CPUが勝ちました");
				}else if(userHand == pa && cpuHand == choki) {
					System.out.println("CPUが勝ちました");
				}else {
					System.out.println("あいこでした");

			}



		}
}