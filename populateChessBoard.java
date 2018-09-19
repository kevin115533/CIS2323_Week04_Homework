public class populateChessBoard {
	public static void main (String[] args){
		
		int bCount = 15;
		
		ChessPiece[] black = new ChessPiece[bCount];
		
		for(int i = 0;i<bCount; i++){
			black[i] = new ChessPiece();
			black[i].makePiece("b","K","a1");
		}
		
		for(int i = 0;i<bCount; i++){
			System.out.println(black[i].printInfo());
		}
		
	}
}