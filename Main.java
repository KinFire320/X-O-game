import java.util.Scanner;

public class Main {

	private static int playerXScore = 0;
	private static int playerOScore = 0;

	public static void increasePlayerXScore() {
		playerXScore++;
	}

	public static void increasePlayerOScore() {
		playerOScore++;
	}

	public static void ShowScores() {
		TextDecoration.printlnColored("player X :" + playerXScore + "\tplayer O :" + playerOScore,
				TextDecoration.BOLD_BLUE);
	}

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		clear();
		startAnimation();

		TextDecoration.printColored("choose rounds count", TextDecoration.BLUE);
		TextDecoration.changeColor(TextDecoration.BOLD_PURPLE);
		int rounds = input.nextInt();
		TextDecoration.resetColor();
		TextDecoration.printlnColored("choose mode : ", TextDecoration.ORANGE);
		TextDecoration.printlnColored("1 : classic", TextDecoration.ORANGE);
		TextDecoration.printColored("2 : inverted", TextDecoration.ORANGE);
		TextDecoration.printlnColored("\twho place three in row loses", TextDecoration.GRAY);
		TextDecoration.printColored("3 : super\t", TextDecoration.ORANGE);
		TextDecoration.printlnColored("unimplumented", TextDecoration.GRAY);
		TextDecoration.printColored("4 : infinet\t", TextDecoration.ORANGE);
		TextDecoration.printlnColored("unimplumented", TextDecoration.GRAY);
		TextDecoration.printColored("5 : inverted infinet\t", TextDecoration.ORANGE);
		TextDecoration.printlnColored("unimplumented", TextDecoration.GRAY);
		TextDecoration.printColored(">>", TextDecoration.ORANGE);
		TextDecoration.changeColor(TextDecoration.GRAY);
		int gameMode = input.nextInt();
		TextDecoration.resetColor();
		if (gameMode == 1 || gameMode == 2)
			for (int i = 0; i < rounds; i++) {
				switch (gameMode) {
					case 1:
						ClassicMode gameClassic = new ClassicMode();
						gameClassic.start();
						break;
					case 2:
						InvertMode gameInvert = new InvertMode();
						gameInvert.start();
						break;
				}
			}
		else {
			TextDecoration.printlnColored("this how you wanna play huh (-_-)\nf#ck it im out", TextDecoration.PURPLE);
			Thread.sleep(1000);
		}

		if (playerXScore > playerOScore) {
			TextDecoration.printlnColored("match endes , X WON", TextDecoration.HIGHLIGHT_GREEN);
		} else if (playerXScore < playerOScore) {
			TextDecoration.printlnColored("match endes , O WON", TextDecoration.HIGHLIGHT_GREEN);
		} else {
			TextDecoration.printlnColored("match endes , and its a TIE", TextDecoration.HIGHLIGHT_GREEN);
		}

		input.nextLine();
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