package rotateImage;

class Solution {
    
    public void swap(int[][] matrix, int x, int y, int xx, int yy){
        int aux = matrix[x][y];
        matrix[x][y] = matrix[xx][yy];
        matrix[xx][yy] = aux;
    }
    
    public void reverse(int[][] matrix,int column){
        int i = 0;
        int j = matrix.length-1;
        while(i < j){
            swap(matrix,i,column,j,column);
            i++;
            j--;
        }    
    }
    
    public void rotate(int[][] matrix) {
        /*We have to process this layer by layer*/
        int levels = matrix.length-1;
        for(int level = 0; level < levels; level++){
            int levelProcess = levels-level;
            for(int i = 0; i < levelProcess; i++){
                swap(matrix,level,i,level+levelProcess-i,levelProcess);   
            }
        }
        for(int i = 0; i < matrix.length;i++){
            
            reverse(matrix,i);
        }
    }
}