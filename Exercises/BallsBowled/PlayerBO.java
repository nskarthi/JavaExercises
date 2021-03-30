package BallsBowled;

import java.util.ArrayList;

public class PlayerBO {
	static ArrayList<Integer> playerList = new ArrayList<Integer>();

	public PlayerBO() {
	}

	public static int getBallsBowled() {
		int total = 0;
		for (int overs : playerList) {
			total += (overs * 6);
		}
		return total;
	}

	public static void setPlayerList(int data) {
		playerList.add(data);
	}

}
