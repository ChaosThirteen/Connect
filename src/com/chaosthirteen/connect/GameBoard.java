package com.chaosthirteen.connect;

public class GameBoard {
	  Integer[][] board;    
	  public GameBoard() {    
		  board = new Integer[7][5];  
	  }
	  
	  public void recordMove(Integer player, Integer column) {    
		  for (Integer i = 0; i < 5; i++) {      
			  if (board[column][i] == 0) {        
				  board[column][i] = player;        
				  continue;      
			  }    
		  }  
	  }    
	  
	  public Boolean isSolved(){    
		  for (Integer i = 0; i < 4; i++) {    
			  for (Integer j = 0; j < 2; j++) {      
				  //Diagonal up      
				  if(board[i][j] != 0 && board[i][j] == board[i + 1][j + 1] && 
						  board[i][j] == board[i + 2][j + 2] && 
						  board[i][j] == board[i + 3][j + 3]) {  	  
					  return true;  	
				  }  	
				  //Diagonal down     
				  if(board[i + 3][j] != 0 && board[i + 3][j] == board[i + 2][j + 1] && 
						  board[i + 3][j] == board[i + 1][j + 2] && 
						  board[i + 3][j] == board[i][j + 3]) {
					  return true;  	
				  }  	
				  //Up      
				  if(board[i][j] != 0 && board[i][j] == board[i + 1][j] && 
						  board[i][j] == board[i + 2][j] && 
						  board[i][j] == board[i + 3][j]) {
					  return true;  	
				  }  	
				  //Across      
				  if(board[i][j] != 0 && board[i][j] == board[i][j + 1] && 
						  board[i][j] == board[i][j + 2] && 
						  board[i][j] == board[i][j + 3]) {
					  return true;  	
				  }    
			  }  
		  }  
		  return false;  
	  }
}
