package ml.khaliman.Task_4_2;

public class Referee {

	public void put(Move move, Board board) {
		board.getEl()[move.getX()][move.getY()] = Player.marker;
	}

	public boolean isWin(Move move, Board board) {
		return false;
	}

}
