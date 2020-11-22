import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	static char userMark ;
	static char computerMark;
	 
	
	public static void main(String[] args) {
		Board[5] = "X".charAt(0);  /// Assume this is old history
		TikTacToeGame Game = new TikTacToeGame();
		Game.chooseMark();
		System.out.println(Game.showBoard());
		Game.userMove(userMark);
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
		System.out.println("Current Board Position is ");
	      return  Board[1] + " | " + Board[2] + " | " + Board[3] +"\n" +  Board[4] + " | " + Board[5] + " | " + Board[6] + "\n" +  Board[7] + " | " + Board[8] + " | " + Board[9];
	}

	public void userMove(char playerMark) {
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.println("Choose number to place Mark");
			int moveNumber = sc1.nextInt(); ///which place user wants to put his marks
			String position = String.valueOf(Board[moveNumber]); 
			if (!(position.equals("X") || position.equals("O"))) {  // check for empty space & loop breaks
				Board[moveNumber] = playerMark;
				break;
			}
		}
	}


}
