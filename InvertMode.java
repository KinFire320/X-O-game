public class InvertMode extends ClassicMode {

	@Override
	public State checkWin() {

		State winner = null;
		if (places[0] != null && places[0] == places[1] && places[0] == places[2]) {
			winner = (places[0] == State.X ? State.O : State.X);

			if (places[0] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[3] != null && places[3] == places[4] && places[3] == places[5]) {
			winner = places[3] == State.X ? State.O : State.X;

			if (places[3] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[6] != null && places[6] == places[7] && places[6] == places[8]) {
			winner = places[6] == State.X ? State.O : State.X;

			if (places[6] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[0] != null && places[0] == places[3] && places[0] == places[6]) {
			winner = places[0] == State.X ? State.O : State.X;

			if (places[0] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[1] != null && places[1] == places[4] && places[1] == places[7]) {
			winner = places[1] == State.X ? State.O : State.X;

			if (places[1] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[2] != null && places[2] == places[5] && places[2] == places[8]) {
			winner = places[2] == State.X ? State.O : State.X;

			if (places[2] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[0] != null && places[0] == places[4] && places[0] == places[8]) {
			winner = places[0] == State.X ? State.O : State.X;

			if (places[0] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		} else if (places[2] != null && places[2] == places[4] && places[2] == places[6]) {
			winner = places[2] == State.X ? State.O : State.X;

			if (places[2] == State.X) {
				Main.increasePlayerOScore();
			} else {
				Main.increasePlayerXScore();
			}
		}
		return winner;

	}

}
