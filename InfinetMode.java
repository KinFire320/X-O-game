import java.util.ArrayList;

public class InfinetMode extends ClassicMode {

	@Override
	public void start() {
		int i = 0;
		ArrayList<Integer> roles = new ArrayList<>();
		while (true) {
			Main.clear();
			Main.ShowScores();

			printBoard();
			TextDecoration.printColored("choose the place >>", TextDecoration.BOLD_ORANGE);

			TextDecoration.changeColor(i % 2 == 0 ? TextDecoration.RED : TextDecoration.BLUE);
			int choice = input.nextInt() - 1; // Changed from chosse to choice
			TextDecoration.resetColor();
			if (board.get(choice) == null) {
				board.put(choice, i % 2 == 0 ? Player.X : Player.O);
				roles.add(choice);
			} else {
				TextDecoration.printColored("really ? (-_-)", TextDecoration.BOLD_PURPLE);
				i--;
				input.nextLine();
				input.nextLine();
			}

			Player winner = checkWin();
			// if one enterd -1 the other will win
			if (choice == -2) {
				winner = i % 2 != 0 ? Player.X : Player.O;
			}

			if (winner != null) {
				Main.clear();
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

			if (board.size() > 6) {
				board.remove(roles.get(0));
				roles.remove(0);
			}

			if (i >= 100) {
				TextDecoration.printlnColored("how the f@ck you tow didnt end this yet ?!", TextDecoration.BOLD_PURPLE);
				TextDecoration.printlnColored("go and play somthing else NERDS", TextDecoration.BOLD_PURPLE);
				Main.fourceStop();
				input.nextLine();
				input.nextLine();
				Main.clear();
				Main.ShowScores();

				TextDecoration.printlnColored("RAY :" + Long.MAX_VALUE, TextDecoration.HIGHLIGHT_PURPLE);
				printBoard();
				return;
			}

			i++;

		}
	}

}
