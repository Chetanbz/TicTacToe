import java.util.Scanner;

public class TikTacToeGame {
	static char [] Board = new char[10];
	
	public static void main(String[] args) {
		chooseMove();
		
	}
	public static char chooseMove() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Chose what player want X or O Please mention");
		String mark1 = sc1.next();
		char mark = mark1.charAt(0);
		return mark;
	}

}
