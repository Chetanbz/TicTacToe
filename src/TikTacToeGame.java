import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	
	public static void main(String[] args) {
		showBoard();	
	}
	public static char chooseMove() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Chose what player want X or O Please mention");
		String mark1 = sc1.next();
		char mark = mark1.charAt(0);
		return mark;
	}
	public static void showBoard() {
		System.out.println(" Type index to avail position ");
		System.out.println(" 1-(0,0) | 2-(0,1) | 3-(0,2) \n 4-(1,0) | 5-(1,1) | 6-(1,2) \n 7-(2,0) | 8-(2,1) | 9-(2,2)");
	}

}
