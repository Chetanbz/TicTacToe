import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	static char userMark ;
	static char computerMark;
	 
	
	public static void main(String[] args) {
		TikTacToeGame Game = new TikTacToeGame();
		Game.chooseMark();
		//System.out.println(userMark +" " + computerMark);
		System.out.println(Game.showBoard());
	}
	
	public  void chooseMark() {
		Scanner sc1 = new Scanner(System.in);
		while(true) {  ///If person provide proper input loop will break
			System.out.println("Chose what player want X or O Please mention");
			String mark1 = sc1.next();
			userMark = mark1.charAt(0);
			if (mark1.equals("X")) {
				computerMark = "O".charAt(0);
				break;
			}
			else if (mark1.equals("O")) {
				computerMark = "X".charAt(0);
				break;
			}
			else {
				System.out.println("Wrong Input");
			}
		}
	}
	public String showBoard() {
	      return  Board[1] + " | " + Board[2] + " | " + Board[3] +"\n" +  Board[4] + " | " + Board[5] + " | " + Board[6] + "\n" +  Board[4] + " | " + Board[5] + " | " + Board[6];
	}

	


}
