package BallsBowled;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int option = 1;
		while (option != 3) {
			System.out.println("1. Add overs bowled\n2. Number of balls bowled\n3. Exit");
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				int overs = sc.nextInt();
				sc.nextLine();
				PlayerBO.setPlayerList(overs);
				break;
			case 2:
				System.out.println("Number of Balls Bowled: " + PlayerBO.getBallsBowled());
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
