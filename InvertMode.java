public class InvertMode extends ClassicMode {

	@Override
	public Player checkWin() {

		Player winner = null;
		if (board.getOrDefault(0, null) != null && board.get(0) == board.get(1) && board.get(0) == board.get(2)) {
			winner = (board.get(0) == Player.X ? Player.O : Player.X);

			if (board.get(0) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(3, null) != null && board.get(3) == board.get(4)
				&& board.get(3) == board.get(5)) {
			winner = board.get(3) == Player.X ? Player.O : Player.X;

			if (board.get(3) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(6, null) != null && board.get(6) == board.get(7)
				&& board.get(6) == board.get(8)) {
			winner = board.get(6) == Player.X ? Player.O : Player.X;

			if (board.get(6) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(0, null) != null && board.get(0) == board.get(3)
				&& board.get(0) == board.get(6)) {
			winner = board.get(0) == Player.X ? Player.O : Player.X;

			if (board.get(0) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(1, null) != null && board.get(1) == board.get(4)
				&& board.get(1) == board.get(7)) {
			winner = board.get(1) == Player.X ? Player.O : Player.X;

			if (board.get(1) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(2, null) != null && board.get(2) == board.get(5)
				&& board.get(2) == board.get(8)) {
			winner = board.get(2) == Player.X ? Player.O : Player.X;

			if (board.get(2) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(0, null) != null && board.get(0) == board.get(4)
				&& board.get(0) == board.get(8)) {
			winner = board.get(0) == Player.X ? Player.O : Player.X;

			if (board.get(0) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		} else if (board.getOrDefault(2, null) != null && board.get(2) == board.get(4)
				&& board.get(2) == board.get(6)) {
			winner = board.get(2) == Player.X ? Player.O : Player.X;

			if (board.get(2) == Player.X) {
				Main.increaseplayer2Score();
			} else {
				Main.increasePlayer1Score();
			}
		}
		return winner;

	}

}
