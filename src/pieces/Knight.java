package pieces;

import java.util.List;

public class Knight extends Piece {
	public Knight(Color color, Position position) {
		super(color, Type.KNIGHT, position);
	}

	@Override
	List<Position> getPossibleMoves() {
		return null;
	}
}
