public class TextDecoration {
	public static final String DEFAULT = "\u001B[0m",
			BOLD = "\u001B[1m",
			HIGHLIGHT_BLACK = "\u001B[2m",
			HIGHLIGHTBLACKITALIC = "\u001B[3m",
			INVISIABLE = "\u001B[27m",
			MIDDLE_LINE = "\u001B[28m",
			GRAY = "\u001B[30m",
			RED = "\u001B[31m",
			GREEN = "\u001B[32m",
			ORANGE = "\u001B[33m",
			BLUE = "\u001B[34m",
			PURPLE = "\u001B[35m",
			CYAN = "\u001B[36m",
			WHITE = "\u001B[37m",
			HIGHLIGHT_GRAY = "\u001B[40m",
			HIGHLIGHT_RED = "\u001B[41m",
			HIGHLIGHT_GREEN = "\u001B[42m",
			HIGHLIGHT_ORANGE = "\u001B[43m",
			HIGHLIGHT_BLUE = "\u001B[44m",
			HIGHLIGHT_PURPLE = "\u001B[45m",
			HIGHLIGHT_CYAN = "\u001B[46m",
			HIGHLIGHT_WHITE = "\u001B[47m",
			HIGHLIGHT_MS = "\u001B[48m",
			UPERLINE_HIGHLIGH_BLACK = "\u001B[53m",
			BOLD_GRAY = "\u001B[90m",
			BOLD_RED = "\u001B[91m",
			BOLD_GREEN = "\u001B[92m",
			BOLD_ORANGE = "\u001B[93m",
			BOLD_BLUE = "\u001B[94m",
			BOLD_PURPLE = "\u001B[95m",
			BOLD_CYAN = "\u001B[96m",
			BOLD_WHITE = "\u001B[97m",
			BOLD_HIGHLIGHT_GRAY = "\u001B[100m",
			BOLD_HIGHLIGHT_RED = "\u001B[101m",
			BOLD_HIGHLIGHT_GREEN = "\u001B[102m",
			BOLD_HIGHLIGHT_ORANGE = "\u001B[103m",
			BOLD_HIGHLIGHT_BLUE = "\u001B[104m",
			BOLD_HIGHLIGHT_PURPLE = "\u001B[105m",
			BOLD_HIGHLIGHT_CYAN = "\u001B[106m",
			BOLD_HIGHLIGHT_WHITE = "\u001B[107m";

	/**
	 * printting colored text
	 * 
	 * @param msg   the massege to print
	 * @param color get from text decration class
	 * @see TextDecoration
	 */
	public static void printColored(Object msg, String color) {
		System.out.print(color + msg + DEFAULT);
	}

	/**
	 * printting colored text
	 * 
	 * @param msg   the massege to print
	 * @param color get from text decration class | if left blank the text will be
	 *              default format unless used changeColor() before it
	 * @see TextDecoration
	 */
	public static void printlnColored(Object msg, String color) {
		System.out.print(color + msg + DEFAULT);
		System.out.println(HIGHLIGHT_MS);
	}

	/**
	 * changing colors of the next print or println
	 * 
	 * @param color the color for the next prints to hava
	 */
	public static void changeColor(String color) {
		System.out.print(color);
	}

	/**
	 * printing a massege without a color modfing
	 * 
	 * @implNote this gonna take the color of the changeColor() method unless
	 *           resetColor() or the other oveloads been called b
	 * @param msg the massege to show
	 */
	public static void printColored(Object msg) {
		System.out.print(msg);
	}

	/**
	 * printing a massege without a color modfing
	 * 
	 * @implNote this gonna take the color of the changeColor() method unless
	 *           resetColor() or the other oveloads been called b
	 * @param msg the massege to show
	 */
	public static void printlnColored(Object msg) {
		System.out.println(msg);
	}

	/**
	 * resets colors to DEFAULT
	 * 
	 * @see TextDecoration
	 */
	public static void resetColor() {
		System.out.print(DEFAULT);
	}
}