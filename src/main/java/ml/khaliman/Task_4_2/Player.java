package ml.khaliman.Task_4_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
	public static char marker;

	public Player(ActionFigure figure) {
		if (figure.equals(ActionFigure.CROSS)) {
			marker = 'X';
		} else {
			marker = 'O';
		}
	}

	public Move turn(Board board) {
		boolean corect = true;
		int x, y;
		do {
			System.out.println("input x and y coordinates");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String numa = null;
			try {
				numa = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			x = Integer.parseInt(numa);
			String numb = null;
			try {
				numb = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			y = Integer.parseInt(numb);
			if (board.getEl()[x][y] != '*') {
				System.out.println("this cell is busy");
				corect = false;
			} else {
				corect = true;
			}
		} while (corect);
		return new Move(x, y);
	}
}
