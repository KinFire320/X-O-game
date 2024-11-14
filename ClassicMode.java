import java.util.HashMap;
import java.util.Scanner;

public class ClassicMode implements Mode {

	protected HashMap<Integer, Player> board = new HashMap<>();
	protected Scanner input = new Scanner(System.in);

	@Override
	public void start() {
		for (int i = 0; i >= 0; i++) {
			Main.clear();
			Main.ShowScores();
			printBoard();
			TextDecoration.printColored("choose the place >>", TextDecoration.BOLD_ORANGE);
			TextDecoration.changeColor(i % 2 == 0 ? TextDecoration.RED : TextDecoration.BLUE);
			int chosse = input.nextInt() - 1;
			TextDecoration.resetColor();
			if (board.getOrDefault(chosse, null) == null) {
				board.put(chosse, i % 2 == 0 ? Player.X : Player.O);
			} else if (board.getOrDefault(chosse, null) != null) {
				TextDecoration.printColored("really ? (-_-)", TextDecoration.BOLD_PURPLE);
				i--;
				input.nextLine();
				input.nextLine();
			}

			Player winner = checkWin();
			// if one enterd -1 the other will win
			if (chosse == -2) {
				winner = (i % 2 != 0 ? Player.X : Player.O);
			}

			if (winner != null) {
				Main.clear();
				if (winner == Player.O) {
					Main.increaseplayer2Score();
				} else {
					Main.increasePlayer1Score();
				}
				Main.ShowScores();
				printBoard();
				TextDecoration.printColored(
						(winner == Player.X ? Main.getPlayer1Name() : Main.getPlayer2Name()).concat(
								" WON!"),
						winner == Player.X ? TextDecoration.RED : TextDecoration.BLUE);
				input.nextLine();
				input.nextLine();
				board.clear();
				break;
			}
			if (winner == null && i >= 8) {
				Main.clear();
				Main.ShowScores();
				printBoard();

				board.clear();

				TextDecoration.printColored("restarting match , press enter to contiue");
				input.nextLine();
				input.nextLine();
				i = 0;
			}
		}
		Main.clear();
	}

	@Override
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// (j + (i * 3));
				if (board.getOrDefault(j + i * 3, null) == null) {
					TextDecoration.printColored(" " + (j + i * 3 + 1) + " ");
				} else if (board.get(j + i * 3) == Player.X) {
					TextDecoration.printColored(" X ", TextDecoration.BOLD_RED);
				} else {
					TextDecoration.printColored(" O ", TextDecoration.BOLD_BLUE);
				}

				TextDecoration.printColored(j != 2 ? "  " : "", TextDecoration.HIGHLIGHT_WHITE);
			}
			TextDecoration.printlnColored(i != 2 ? "\n             " : "", TextDecoration.HIGHLIGHT_WHITE);
		}
	}

	@Override
	public Player checkWin() {

		Player winner = null;
		if (board.getOrDefault(0, null) != null &&
				board.get(0) == board.get(1) && board.get(0) == board.get(2)) {
			winner = board.get(0);
		} else if (board.getOrDefault(3, null) != null && board.get(3) == board.get(4)
				&& board.get(3) == board.get(5)) {
			winner = board.get(3);
		} else if (board.getOrDefault(6, null) != null && board.get(6) == board.get(7)
				&& board.get(6) == board.get(8)) {
			winner = board.get(6);
		} else if (board.getOrDefault(0, null) != null && board.get(0) == board.get(3)
				&& board.get(0) == board.get(6)) {
			winner = board.get(0);
		} else if (board.getOrDefault(1, null) != null && board.get(1) == board.get(4)
				&& board.get(1) == board.get(7)) {
			winner = board.get(1);
		} else if (board.getOrDefault(2, null) != null && board.get(2) == board.get(5)
				&& board.get(2) == board.get(8)) {
			winner = board.get(2);
		} else if (board.getOrDefault(0, null) != null && board.get(0) == board.get(4)
				&& board.get(0) == board.get(8)) {
			winner = board.get(0);
		} else if (board.getOrDefault(2, null) != null && board.get(2) == board.get(4)
				&& board.get(2) == board.get(6)) {
			winner = board.get(2);
		}
		return winner;

	}
}
