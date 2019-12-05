package ml.khaliman.Task_4_2;

public class Board {
	char[][] el = new char[3][3];

	public char[][] getEl() {
		return el;
	}

	public void fillBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				el[i][j] = '*';
			}
		}
	}

	public boolean hasMoreSpace() {
		int caunt = 0;
		for (char[] controlArr : el) {
			for (char control : controlArr) {
				if (control == '*') {
					caunt++;
				}
			}
		}
		if (caunt < 2) {
			return false;
		} else return true;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(el[i][j] + " ");
			}
		}
	}
}
