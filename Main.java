import java.util.Scanner;

public class Main {

	private static int player1Score = 0;
	private static int player2Score = 0;
	private static String player1Name;
	private static String player2Name;
	private static Boolean stop = false;

	public static void increasePlayer1Score() {
		player1Score++;
	}

	public static void increaseplayer2Score() {
		player2Score++;
	}

	public static String getPlayer1Name() {
		return player1Name;
	}

	public static String getPlayer2Name() {
		return player2Name;
	}

	public static void fourceStop() {
		stop = true;
	}

	public static void ShowScores() {
		TextDecoration.printColored(player1Name + " : " + player1Score,
				TextDecoration.HIGHLIGHT_RED);
		TextDecoration.printColored(player2Name + " : " + player2Score,
				TextDecoration.HIGHLIGHT_BLUE);
	}

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		clear();
		startAnimation();
		TextDecoration.printColored("player 1 name >>", TextDecoration.ORANGE);
		player1Name = input.next();
		TextDecoration.printColored("player 2 name >>", TextDecoration.ORANGE);
		player2Name = input.next();
		finish: while (!stop) {
			TextDecoration.printColored("choose rounds count (-1 for infinet) >>", TextDecoration.BOLD_ORANGE);
			TextDecoration.changeColor(TextDecoration.BOLD_PURPLE);
			int rounds = input.nextInt();
			TextDecoration.resetColor();
			if (rounds == -1)
				break;
			rounds: while (!stop) {
				TextDecoration.printlnColored("choose mode : ", TextDecoration.BOLD_ORANGE);
				TextDecoration.printlnColored("1 : classic", TextDecoration.BOLD_ORANGE);
				TextDecoration.printColored("2 : inverted", TextDecoration.BOLD_ORANGE);
				TextDecoration.printlnColored("\t\twho place three in row loses", TextDecoration.GRAY);
				TextDecoration.printColored("3 : infinet\t\t", TextDecoration.BOLD_ORANGE);
				TextDecoration.printlnColored(
						"the first place choosed will be rmoved to make the game go for ever until someone losses",
						TextDecoration.GRAY);
				TextDecoration.printColored("4 : inverted infinet\t", TextDecoration.BOLD_ORANGE);
				TextDecoration.printlnColored("i dont need to explain right?", TextDecoration.BOLD_PURPLE);
				TextDecoration.printColored("5 : super\t\t", TextDecoration.BOLD_ORANGE);
				TextDecoration.printlnColored("unimplumented", TextDecoration.GRAY);
				TextDecoration.printColored("6 : back to rounds\t\t", TextDecoration.BOLD_ORANGE);
				TextDecoration.printColored(">>", TextDecoration.BOLD_ORANGE);
				TextDecoration.changeColor(TextDecoration.GRAY);
				int gameMode = input.nextInt();
				TextDecoration.resetColor();

				for (int i = 0; i != rounds; i++) {
					switch (gameMode) {
						case 1:
							ClassicMode gameC = new ClassicMode();
							gameC.start();
							break;
						case 2:
							InvertMode gameInv = new InvertMode();
							gameInv.start();
							break;
						case 3:
							InfinetMode gameInf = new InfinetMode();
							gameInf.start();
							break;
						case 4:
							InfinetInvertedMode gameInfInv = new InfinetInvertedMode();
							gameInfInv.start();
						case 6:
							break rounds;

						default:
							TextDecoration.printlnColored("this how you wanna play huh ?(-_-)",
									TextDecoration.PURPLE);
							Thread.sleep(1000);
							TextDecoration.printlnColored("f#ck this im out",
									TextDecoration.PURPLE);
							break finish;

					}

					if (stop) {
						break finish;
					}
					if (rounds == -1) {
						break finish;
					}
					switch (Math.abs(player2Score - player1Score)) {
						case 3:
							TextDecoration.printColored("someone got cooked");
							break;

						case 6:
							TextDecoration.printColored("danm ('_')");
							break;

						case 9:
							TextDecoration.printColored("bruh ! give youre frind some points");
							break;

						case 12:
							TextDecoration.printColored("BRO !!");
							break;

						case 15:
							TextDecoration.printColored("time to play outside !!!");
							break finish;

						default:
							break;
					}
				}

			}

		}

		if (stop) {
			TextDecoration.printlnColored("match endes , RAY WON", TextDecoration.HIGHLIGHT_GREEN);
		} else if (player1Score > player2Score) {
			TextDecoration.printlnColored("match endes , X WON", TextDecoration.HIGHLIGHT_GREEN);
		} else if (player1Score < player2Score) {
			TextDecoration.printlnColored("match endes , O WON", TextDecoration.HIGHLIGHT_GREEN);
		} else {
			TextDecoration.printlnColored("match endes , and its a TIE", TextDecoration.HIGHLIGHT_GREEN);
		}

		input.nextLine();
	}

	public static void startAnimation() throws InterruptedException {
		try {
			TextDecoration.printlnColored("STARTING GAME : PLEAS WAIT", TextDecoration.BOLD_ORANGE);
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
		TextDecoration.printlnColored("the game is simple and every mode has simple rules", TextDecoration.BOLD_ORANGE);
		TextDecoration.printColored("red", TextDecoration.HIGHLIGHT_RED);
		TextDecoration.printColored(" is player 1 and", TextDecoration.BOLD_ORANGE);
		TextDecoration.printColored("blue", TextDecoration.HIGHLIGHT_BLUE);
		TextDecoration.printlnColored(" is player 2", TextDecoration.BOLD_ORANGE);
		TextDecoration.printlnColored("1 > all type fialds are numbers so dont make hard for youre self",
				TextDecoration.BOLD_ORANGE);
		TextDecoration.printlnColored("2 > you can type '-1' in youre turn to give up", TextDecoration.BOLD_ORANGE);
		TextDecoration.printlnColored("3 > the one making the most points when exiting the game wins",
				TextDecoration.BOLD_ORANGE);

		TextDecoration.printlnColored("press enter to continue", TextDecoration.BOLD_ORANGE);
		input.nextLine();

	}

	public static void clear() {
		System.out.print("\033c");
	}
}