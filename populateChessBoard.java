public class populateChessBoard {
	public static void main (String[] args){
		
		int bCount = 15;
		char nonPawn[] = {'R','N','B','Q','K','B','N','R'};
	
		
		ChessPiece[] black = new ChessPiece[bCount];
		
		for(int i = 0;i<bCount; i++){
			black[i] = new ChessPiece();
			if(i<=7){
				black[i].makePiece("b",nonPawn[i],"a1");
			}
			else{			
				black[i].makePiece("b",'P',"a1");
			}
		}
		
		for(int i = 0;i<bCount; i++){
			System.out.println(black[i].printInfo());
		}
		
	}
}