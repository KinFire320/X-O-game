import java.util.Scanner;

public class ClassicMode implements Mode {

	protected static State[] places = new State[9];
	protected static Scanner input = new Scanner(System.in);

	@Override
	public void start() {
		for (int i = 0; i < places.length; i++) {
			Main.clear();
			Main.ShowScores();
			printBoard();
			TextDecoration.printColored("choose the place >>", TextDecoration.BOLD_ORANGE);
			TextDecoration.changeColor(i % 2 == 0 ? TextDecoration.RED : TextDecoration.BLUE);
			int chosse = input.nextInt() - 1;
			TextDecoration.resetColor();
			if (places[chosse] == null)
				places[chosse] = i % 2 == 0 ? State.X : State.O;
			else {
				TextDecoration.printColored("really ? (-_-)", TextDecoration.BOLD_PURPLE);
				i--;
				input.nextLine();
				input.nextLine();
			}

			State winner = checkWin();
			if (winner != null) {
				Main.clear();
				Main.ShowScores();
				printBoard();
				TextDecoration.printColored(winner + " WON!");
				input.nextLine();
				input.nextLine();
				for (int j = 0; j < places.length; j++) {
					places[j] = null;
				}
				break;
			}
			if (winner == null && i == places.length - 1) {
				Main.clear();
				Main.ShowScores();
				printBoard();

				for (int j = 0; j < places.length; j++) {
					places[j] = null;
				}

				TextDecoration.printColored("restarting match , press enter to contiue");
				input.nextLine();
				input.nextLine();
				i = 0;
			}
			Main.clear();
		}
	}

	@Override
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// (j + (i * 3));
				if (places[j + (i * 3)] == null) {
					TextDecoration.printColored(" " + (j + (i * 3) + 1) + " ");
				} else if (places[j + (i * 3)] == State.X) {
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
	public State checkWin() {

		State winner = null;
		if (places[0] != null && places[0] == places[1] && places[0] == places[2]) {
			winner = places[0];

			if (places[0] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[3] != null && places[3] == places[4] && places[3] == places[5]) {
			winner = places[3];

			if (places[3] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[6] != null && places[6] == places[7] && places[6] == places[8]) {
			winner = places[6];

			if (places[6] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[0] != null && places[0] == places[3] && places[0] == places[6]) {
			winner = places[0];

			if (places[0] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[1] != null && places[1] == places[4] && places[1] == places[7]) {
			winner = places[1];

			if (places[1] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[2] != null && places[2] == places[5] && places[2] == places[8]) {
			winner = places[2];

			if (places[2] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[0] != null && places[0] == places[4] && places[0] == places[8]) {
			winner = places[0];

			if (places[0] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[2] != null && places[2] == places[4] && places[2] == places[6]) {
			winner = places[2];

			if (places[2] == State.O) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		}
		return winner;

	}
}
