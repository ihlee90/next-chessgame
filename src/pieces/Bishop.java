package pieces;

import java.util.List;


public class Bishop extends Piece {
	public Bishop(Color color, Position position) {
		super(color, Type.BISHOP, position);
	}

	@Override
	List<Position> getPossibleMoves() {
		return null;
	}
}