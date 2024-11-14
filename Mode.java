public interface Mode {
	/**
	 * there where the magic happens the game mode starts in this method to determen
	 * the game flow and the winner
	 */
	public void start();

	/**
	 * prints the game board for players to see where thay put there marks
	 */
	void printBoard();

	/**
	 * checkes for the winning companation in the board
	 * 
	 * @return mostly null but if one of the winnig copanation been taked by one
	 *         player it return the player mark
	 */
	Player checkWin();
}
