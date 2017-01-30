package edu.jsu.mcis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToeModel extends JPanel{
    
//    protected static JButton topLbn, topMbn, topRbn, ctrLbn, ctrMbn, ctrRbn, btmLbn, btmMbn, btmRbn;
//    public JButtonGrid(){
        
        JButton[][] buttonGrid = new JButton[3][3];
        
//        topLbn = new JButton("_");
//        topLbn.setVerticalTextPosition(AbstractButton.TOP);
//        topLbn.setHorizontalTextPosition(AbstractButton.LEADING);
//        topLbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
//        topMbn = new JButton("_");
//        topMbn.setVerticalTextPosition(AbstractButton.TOP);
//        topMbn.setHorizontalTextPosition(AbstractButton.CENTER);
//        topMbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        topRbn = new JButton("_");
//        topRbn.setVerticalTextPosition(AbstractButton.TOP);
//        topRbn.setHorizontalTextPosition(AbstractButton.TRAILING);
//        topRbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        ctrLbn = new JButton("_");
//        ctrLbn.setVerticalTextPosition(AbstractButton.CENTER);
//        ctrLbn.setHorizontalTextPosition(AbstractButton.LEADING);
//        ctrLbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        ctrMbn = new JButton("_");
//        ctrMbn.setVerticalTextPosition(AbstractButton.CENTER);
//        ctrMbn.setHorizontalTextPosition(AbstractButton.CENTER);
//        ctrMbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        ctrRbn = new JButton("_");
//        ctrRbn.setVerticalTextPosition(AbstractButton.CENTER);
//        ctrRbn.setHorizontalTextPosition(AbstractButton.TRAILING);
//        ctrRbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        btmLbn = new JButton("_");
//        btmLbn.setVerticalTextPosition(AbstractButton.BOTTOM);
//        btmLbn.setHorizontalTextPosition(AbstractButton.LEADING);
//        btmLbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        btmMbn = new JButton("_");
//        btmMbn.setVerticalTextPosition(AbstractButton.BOTTOM);
//        btmMbn.setHorizontalTextPosition(AbstractButton.CENTER);
//        btmMbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
        
//        btmRbn = new JButton("_");
//        btmRbn.setVerticalTextPosition(AbstractButton.BOTTOM);
//        btmRbn.setHorizontalTextPosition(AbstractButton.TRAILING);
//        btmRbn.addActionListiener (new ActionListener(){
            
//            public void actionperformed(ActionEvent e){
            
//            }
//        });
        
    
    

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
                

    	public static void actionPerformed(ActionEvent e){
            JButton.setText(m);
            JButton.setEnable(false);
            board.setMark(buttonGrid);
            getWinner();
            boardFull();
            GameOver();
	}
}
