public class TextDecoration {

	// ==========================================
	// Reset & Default Styles
	// ==========================================
	public static final String DEFAULT = "\u001B[0m";
	public static final String RESET = "\u001B[0m";

	// ==========================================
	// Text Styles / Attributes
	// ==========================================
	public static final String BOLD = "\u001B[1m";
	public static final String FAINT = "\u001B[2m";
	public static final String DIM = "\u001B[2m";
	public static final String ITALIC = "\u001B[3m";
	public static final String UNDERLINE = "\u001B[4m";
	public static final String REVERSE = "\u001B[7m";
	public static final String INVERT = "\u001B[7m";
	public static final String INVISIBLE = "\u001B[8m";
	public static final String HIDDEN = "\u001B[8m";
	public static final String STRIKETHROUGH = "\u001B[9m";
	public static final String CROSSED_OUT = "\u001B[9m";
	public static final String OVERLINE = "\u001B[53m";

	// ==========================================
	// Standard Foreground Colors (30 - 37)
	// ==========================================
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String MAGENTA = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	public static final String DEFAULT_FG = "\u001B[39m";

	// ==========================================
	// Standard Background / Highlight Colors (40 - 47, 49)
	// ==========================================
	public static final String BG_BLACK = "\u001B[40m";
	public static final String BG_RED = "\u001B[41m";
	public static final String BG_GREEN = "\u001B[42m";
	public static final String BG_YELLOW = "\u001B[43m";
	public static final String BG_BLUE = "\u001B[44m";
	public static final String BG_MAGENTA = "\u001B[45m";
	public static final String BG_CYAN = "\u001B[46m";
	public static final String BG_WHITE = "\u001B[47m";
	public static final String BG_DEFAULT = "\u001B[49m";

	// Highlight prefix aliases for standard backgrounds
	public static final String HIGHLIGHT_BLACK = BG_BLACK;
	public static final String HIGHLIGHT_RED = BG_RED;
	public static final String HIGHLIGHT_GREEN = BG_GREEN;
	public static final String HIGHLIGHT_YELLOW = BG_YELLOW;
	public static final String HIGHLIGHT_BLUE = BG_BLUE;
	public static final String HIGHLIGHT_MAGENTA = BG_MAGENTA;
	public static final String HIGHLIGHT_CYAN = BG_CYAN;
	public static final String HIGHLIGHT_WHITE = BG_WHITE;

	// ==========================================
	// Bright / High-Intensity Foreground Colors (90 - 97)
	// ==========================================
	public static final String BRIGHT_BLACK = "\u001B[90m";
	public static final String BRIGHT_GRAY = "\u001B[90m";
	public static final String BRIGHT_RED = "\u001B[91m";
	public static final String BRIGHT_GREEN = "\u001B[92m";
	public static final String BRIGHT_YELLOW = "\u001B[93m";
	public static final String BRIGHT_BLUE = "\u001B[94m";
	public static final String BRIGHT_MAGENTA = "\u001B[95m";
	public static final String BRIGHT_CYAN = "\u001B[96m";
	public static final String BRIGHT_WHITE = "\u001B[97m";

	// ==========================================
	// Bright / High-Intensity Background Colors (100 - 107)
	// ==========================================
	public static final String BG_BRIGHT_BLACK = "\u001B[100m";
	public static final String BG_BRIGHT_GRAY = "\u001B[100m";
	public static final String BG_BRIGHT_RED = "\u001B[101m";
	public static final String BG_BRIGHT_GREEN = "\u001B[102m";
	public static final String BG_BRIGHT_YELLOW = "\u001B[103m";
	public static final String BG_BRIGHT_BLUE = "\u001B[104m";
	public static final String BG_BRIGHT_MAGENTA = "\u001B[105m";
	public static final String BG_BRIGHT_CYAN = "\u001B[106m";
	public static final String BG_BRIGHT_WHITE = "\u001B[107m";

	// Highlight prefix aliases for bright backgrounds
	public static final String HIGHLIGHT_BRIGHT_BLACK = BG_BRIGHT_BLACK;
	public static final String HIGHLIGHT_BRIGHT_GRAY = BG_BRIGHT_GRAY;
	public static final String HIGHLIGHT_BRIGHT_RED = BG_BRIGHT_RED;
	public static final String HIGHLIGHT_BRIGHT_GREEN = BG_BRIGHT_GREEN;
	public static final String HIGHLIGHT_BRIGHT_YELLOW = BG_BRIGHT_YELLOW;
	public static final String HIGHLIGHT_BRIGHT_BLUE = BG_BRIGHT_BLUE;
	public static final String HIGHLIGHT_BRIGHT_MAGENTA = BG_BRIGHT_MAGENTA;
	public static final String HIGHLIGHT_BRIGHT_CYAN = BG_BRIGHT_CYAN;
	public static final String HIGHLIGHT_BRIGHT_WHITE = BG_BRIGHT_WHITE;

	// ==========================================
	// Compatibility Aliases (legacy & colloquial names)
	// ==========================================
	public static final String ORANGE = YELLOW;
	public static final String PURPLE = MAGENTA;
	public static final String GRAY = BRIGHT_BLACK; // 90m is visually dark gray / bright black

	public static final String HIGHLIGHT_GRAY = BG_BLACK; // Formerly 40m
	public static final String HIGHLIGHT_ORANGE = HIGHLIGHT_YELLOW;
	public static final String HIGHLIGHT_PURPLE = HIGHLIGHT_MAGENTA;
	public static final String HIGHLIGHT_MS = BG_DEFAULT; // Default / reset background

	public static final String HIGHLIGHTBLACKITALIC = ITALIC;
	public static final String INVISIABLE = INVISIBLE; // Corrected spelling & code (8m)
	public static final String MIDDLE_LINE = STRIKETHROUGH; // Corrected code (9m)
	public static final String UPERLINE_HIGHLIGH_BLACK = OVERLINE; // Corrected code (53m)

	public static final String BOLD_GRAY = BRIGHT_GRAY;
	public static final String BOLD_RED = BRIGHT_RED;
	public static final String BOLD_GREEN = BRIGHT_GREEN;
	public static final String BOLD_ORANGE = BRIGHT_YELLOW;
	public static final String BOLD_BLUE = BRIGHT_BLUE;
	public static final String BOLD_PURPLE = BRIGHT_MAGENTA;
	public static final String BOLD_CYAN = BRIGHT_CYAN;
	public static final String BOLD_WHITE = BRIGHT_WHITE;

	public static final String BOLD_HIGHLIGHT_GRAY = BG_BRIGHT_BLACK;
	public static final String BOLD_HIGHLIGHT_RED = BG_BRIGHT_RED;
	public static final String BOLD_HIGHLIGHT_GREEN = BG_BRIGHT_GREEN;
	public static final String BOLD_HIGHLIGHT_ORANGE = BG_BRIGHT_YELLOW;
	public static final String BOLD_HIGHLIGHT_BLUE = BG_BRIGHT_BLUE;
	public static final String BOLD_HIGHLIGHT_PURPLE = BG_BRIGHT_MAGENTA;
	public static final String BOLD_HIGHLIGHT_CYAN = BG_BRIGHT_CYAN;
	public static final String BOLD_HIGHLIGHT_WHITE = BG_BRIGHT_WHITE;

	/**
	 * Prints colored text followed by the reset code.
	 *
	 * @param msg   the message to print
	 * @param color ANSI color/decoration code from TextDecoration
	 * @see TextDecoration
	 */
	public static void printColored(Object msg, String color) {
		System.out.print(color + msg + DEFAULT);
	}

	/**
	 * Prints colored text followed by the reset code and a newline.
	 *
	 * @param msg   the message to print
	 * @param color ANSI color/decoration code from TextDecoration
	 * @see TextDecoration
	 */
	public static void printlnColored(Object msg, String color) {
		System.out.println(color + msg + DEFAULT);
	}

	/**
	 * Changes the active color/style for subsequent print/println calls.
	 *
	 * @param color the ANSI color code to apply
	 */
	public static void changeColor(String color) {
		System.out.print(color);
	}

	/**
	 * Prints a message without appending color formatting.
	 *
	 * @implNote Uses whatever color was set by changeColor(), unless
	 *           resetColor() or an overload was called before.
	 * @param msg the message to show
	 */
	public static void printColored(Object msg) {
		System.out.print(msg);
	}

	/**
	 * Prints a message followed by a newline without appending color formatting.
	 *
	 * @implNote Uses whatever color was set by changeColor(), unless
	 *           resetColor() or an overload was called before.
	 * @param msg the message to show
	 */
	public static void printlnColored(Object msg) {
		System.out.println(msg);
	}

	/**
	 * Resets terminal colors and formatting to DEFAULT.
	 *
	 * @see TextDecoration
	 */
	public static void resetColor() {
		System.out.print(DEFAULT);
	}
}
