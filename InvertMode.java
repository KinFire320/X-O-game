import java.util.HashMap;

public class InvertMode extends ClassicMode {

	@Override
	public Player checkWin(HashMap<Integer, Player> board) {

		Player winner = null;
		if (board.getOrDefault(0, null) != null && board.get(0) == board.get(1) && board.get(0) == board.get(2)) {
			winner = (board.get(0));
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
		if (winner != null) {
			winner = winner == Player.X ? Player.O : Player.X;
		}
		return winner;

	}

}
