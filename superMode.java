import java.util.HashMap;

public class superMode implements Mode {

	Player[][] board = new Player[9][9];

	@Override
	public void start() {
	}

	@Override
	public void printBoard() {
		// meteor man : good luck , you will need it
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// for (int k = 0; k < 3; k++) {
		// for (int c = 0; c < 3; c++) {
		// System.out.print(" " + (c + j * 3 + 1));
		// }
		// System.out.print("|");
		// }
		// System.out.println("\b\n--------------------");
		// }
		// }
	}

	@Override
	public Player checkWin(HashMap<Integer, Player> board) {
		return null;
	}

}