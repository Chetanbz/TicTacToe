import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	static String curentBoard = "   1  |  2   | 3   \n   4  |  5   | 6    \n   7  |  8   | 9   ";
	static char userMark ;
	static char computerMark;
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		TikTacToeGame  tikTacToeGame = new TikTacToeGame();
		System.out.println(" 1-(0,0) | 2-(0,1) | 3-(0,2) \n 4-(1,0) | 5-(1,1) | 6-(1,2) \n 7-(2,0) | 8-(2,1) | 9-(2,2)");
		tikTacToeGame.showBoard();	
		tikTacToeGame.chooseMove();
		System.out.println(" Which position user wants to mark Specify number as per above  ");
		int num = sc1.nextInt();
		char c = String.valueOf(num).charAt(0);
		String curentBoard2 = curentBoard.replace(c,userMark); 
		System.out.println(curentBoard2);
		//tikTacToeGame.showBoard();
		
	}
	public  void chooseMove() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Chose what player want X or O Please mention");
		String mark1 = sc1.next();
		userMark = mark1.charAt(0);
		if (mark1.equals("X")) {
			computerMark = "O".charAt(0);	
		}
		else if (mark1.equals("O")) {
			computerMark = "X".charAt(0);	
		}
		else {
			System.out.println("Wrong move ");
		
		}
		System.out.println(userMark + " " + computerMark);
	}
	public  void showBoard() {
		System.out.println(" Cureent Board Position ");
		System.out.println(curentBoard);
	}
	
	public void replace(char c, char playerMark){
		for (int i =0; i < curentBoard.length(); i++) {
			curentBoard = curentBoard.replace(c,playerMark);  
			showBoard();
		}
	}
	


}
