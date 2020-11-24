import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	static char userMark ;
	static char computerMark;
	static int tossNumber;
	 
	
	public static void main(String[] args) {
		TikTacToeGame Game = new TikTacToeGame();
		tossNumber = toss();
		Game.chooseMark();
		while(!checkBoardFull()) {
			//System.out.println(Game.showBoard());
			if (tossNumber ==0) {
				Game.computerMove();
				System.out.println(Game.showBoard());
				tossNumber = 1;
			}
			else {
				Game.userMove();
				System.out.println(Game.showBoard());
				tossNumber = 0;
			}
			if (Game.winnerCondition() == true) {
				System.out.println("Winning turn ");
				
			}
	
		}
	}
	
	public  void chooseMark() {
		Scanner sc1 = new Scanner(System.in);
		String mark1 ="O";
		while(true) {  ///If person provide proper input loop will break
			if (tossNumber == 1) {
				System.out.println("Chose what player want X or O Please mention");
				mark1 = sc1.next();
			}
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
	public static int toss() {
		int outcome = (int)Math.floor(Math.random()*10)%2;
		if (outcome ==1) {
			System.out.println(" Player won toss");
		}
		else {
			System.out.println(" Computer won toss");
		}
		return outcome;
	}

	public void userMove() {
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.println("Choose number to place Mark");
			int moveNumber = sc1.nextInt(); ///which place user wants to put his marks
			String position = String.valueOf(Board[moveNumber]); 
			if (!(position.equals("X") || position.equals("O"))) {  // check for empty space & loop breaks
				Board[moveNumber] = userMark;
				break;
			}
		}
	}
	
	public void computerMove() {
		while(true) {
			int computerNumber = (int)Math.floor(Math.random()*10)%9 + 1;
			System.out.println("Computer chooses " + computerNumber);
			String position = String.valueOf(Board[computerNumber]); 
			if (!(position.equals("X") || position.equals("O"))) {  // check for empty space & loop breaks
				Board[computerNumber] = computerMark;
				break;
			}
		}
	}
	public static boolean checkBoardFull() {
		for(int i =0; i<Board.length; i++) {
			String position = String.valueOf(Board[i]); 
			if (!(position.equals("X") || position.equals("O"))) {  // check for empty space & loop breaks
				return false;
			}
		}
		return true;
		
	}
	public boolean winnerCondition() { 
		boolean conditionHorizontal = ((Board[1] == Board[4] && Board[1]==Board[7]) || (Board[1] == Board[2] && Board[1]==Board[3]) || (Board[7] == Board[8] && Board[7]==Board[9]) || (Board[3] == Board[6] && Board[3]==Board[9]));
	    boolean conditionDiagonal   = ((Board[1] == Board[5] && Board[1]==Board[9]) && (Board[3] == Board[5] && Board[5]==Board[7]));
	    if (conditionHorizontal == true || conditionDiagonal == true) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

}
