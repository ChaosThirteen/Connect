package com.chaosthirteen.connect;

public class Moderator {
	private Player playerOne;
	private Player playerTwo;
	private GameBoard gameBoard;

	public void main() {
		Boolean isPlayerOnesTurn = true;
		int playedRow;

		while (!gameBoard.isSolved()) {
			if (isPlayerOnesTurn) {
				playedRow = playerOne.play(gameBoard);
				gameBoard.recordMove(1, playedRow);
			} else {
				playedRow = playerTwo.play(gameBoard);
				gameBoard.recordMove(2, playedRow);
			}
			isPlayerOnesTurn = !isPlayerOnesTurn;

			// update gui
		}
	}
}
