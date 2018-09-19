public class ChessPiece{
	
	private String pos;
	private String color;
	private char type;
	
	public void makePiece (String x, char y, String z){
		setColor(x);
		setPosition(z);
		setPieceType(y);
	}
	
	public void setPosition(String x){
		pos = x;
	}
	
	public String getPosition(){
		return pos;
	}
	
	public void setColor(String x){
		color = x;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setPieceType(char x){
		type = x;
	}
	
	public char getPieceType(){
		return type;
	}
	
	public String printInfo(){
		return color + type + pos; 
	}
}	
