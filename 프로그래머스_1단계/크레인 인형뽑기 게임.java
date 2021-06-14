import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int removeCnt=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int col: moves){
            
            for(int row=0; row < board.length; row++){
                if(board[row][col-1] != 0){
                    
                    if(list.size() == 0 ){
                        list.add(board[row][col-1]);
                        board[row][col-1] = 0;
                        
                        break;
                    }
                    
                    if(list.get(list.size()-1) == board[row][col-1]){
                        removeCnt += 2;
                        list.remove(list.size()-1);
                        board[row][col-1] = 0;
                    } else {
                        list.add(board[row][col-1]);
                        board[row][col-1] = 0;
                    }
                    
                    break;
                }
            }    
        }
        
            
        return removeCnt;
    }
}