package edu.jsu.mcis;

public class TicTacToeModel {
    public enum Mark { EMPTY, X, O };
    private Mark[][] board;
    private boolean xTurn;
    private boolean GameOver;
    private boolean boardFull;
    public String m;
    
    public TicTacToeModel() {
        board = new Mark[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = Mark.EMPTY;
            }
        }
        xTurn = true;
    }
    
    public Mark getMark(int row, int col) {
        return board[row][col];
    }
    
    public void setMark(int row, int col) {
        Mark m = (xTurn)? Mark.X : Mark.O;
        if(board[row][col] == Mark.EMPTY) {
            board[row][col] = m;
            xTurn = !xTurn;
        }
    }
	//public void changePlayer(){
	//	if xTurn = true{
	//		xTurn = false;
	//	}
	//	else if xTurn = false{
	//		xTurn = true;
	//	}
	//}
	
	public void getWinner(){
		
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        if(getMark(0, 0) == getMark(0, 1) && getMark(0, 1) == getMark(0, 2)){
                            System.out.println("Winner is " + m);
                            GameOver = false;
		}
	//	else if (getMark([1][0]) == getMark([1][1]) == getMark([1][2])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([2][0]) == getMark([2][1]) == getMark([2][2])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([0][0]) == getMark([1][0]) == getMark([2][0])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([0][1]) == getMark([1][1]) == getMark([2][1])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([0][2]) == getMark([1][2]) == getMark([2][2])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([0][0]) == getMark([1][1]) == getMark([2][2])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
	//	else if (getMark([0][2]) == getMark([1][1]) == getMark([2][0])){
	//		GameOver = true;
	//		System.out.nl("Winner is " + m);
	//	}
		
                }
            }
        }
        
        public void boardFull(){
            for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++){
                        if(getMark(i,j) == Mark.EMPTY){
                        boardFull = false;
                        }
                    }
            }
            
        }
        
        public void GameOver(){
            if(boardFull = false){
                getWinner();
            }
            
            if(boardFull = true){
                System.out.println("Its a tie");
                GameOver = true;
            }
        }
                
		
}
