import java.util.Scanner;

public class Main {
	enum placeState {
		X,
		O
	}

	static Scanner input = new Scanner(System.in);

	static placeState[] places = new placeState[9];

	public static void main(String[] args) throws InterruptedException {
		clear();
		startAnimation();

		for (int i = 0; i < places.length; i++) {
			clear();
			printBoard();
			TextDecoration.printColored("chosse the place >>", TextDecoration.BOLD_ORANGE);
			int chosse = input.nextInt();
			if (places[chosse - 1] == null)
				places[chosse - 1] = i % 2 == 0 ? placeState.X : placeState.O;
			else {
				TextDecoration.printColored("really ? (-_-)", TextDecoration.BOLD_PURPLE);
				input.nextLine();
				input.nextLine();
				i--;
			}
		}
		clear();
		printBoard();
		input.nextLine();
		input.nextLine();

	}

	private static void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// (j + (i * 3));
				if (places[j + (i * 3)] == null) {
					TextDecoration.printColored(" " + (j + (i * 3) + 1) + " ");
				} else if (places[j + (i * 3)] == placeState.X) {
					TextDecoration.printColored(" X ", TextDecoration.BOLD_RED);
				} else {
					TextDecoration.printColored(" O ", TextDecoration.BOLD_BLUE);
				}

				TextDecoration.printColored(j != 2 ? " " : "", TextDecoration.HIGHLIGHT_WHITE);
			}
			TextDecoration.printlnColored(i != 2 ? "\n           " : "", TextDecoration.HIGHLIGHT_WHITE);
		}
	}

	public static void startAnimation() throws InterruptedException {
		try {
			TextDecoration.printlnColored("STARTING GAME : PLEAS WAIT", TextDecoration.ORANGE);
			for (int i = 0; i < 20; i++) {
				TextDecoration.printColored("X", TextDecoration.BOLD_HIGHLIGHT_RED);
				Thread.sleep(50);
				TextDecoration.printColored("O", TextDecoration.BOLD_HIGHLIGHT_BLUE);
				Thread.sleep(50);

			}
			System.out.println();
			TextDecoration.printColored("loding done seccessfuly", TextDecoration.BOLD_GREEN);
			Thread.sleep(1000);
			clear();
		} catch (Exception e) {
			TextDecoration.printColored("error interrubted loading the game start screen : " + e, TextDecoration.RED);
		}

	}

	public static void clear() {
		System.out.print("\033c");
	}
}