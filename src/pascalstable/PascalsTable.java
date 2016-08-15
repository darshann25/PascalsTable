/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalstable;

/**
 *
 * @author darshanpatel
 */
public class PascalsTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int SIZE_OF_PASCAL_TABLE = 7;
        int result[][] = getPascalTable(SIZE_OF_PASCAL_TABLE);
        for (int i=0; i<SIZE_OF_PASCAL_TABLE; i++){
            for (int k=0; k<i+1; k++) {
            System.out.print(result[i][k] + " ");
            }
            System.out.println();
        }
    }
    
  private static int[][] getPascalTable (int value) {
  int[][] result = new int[value][];
  int[] row = {1};
  result[0]=row;

  for(int i=1; i<value; i++){
    int[] newRow = new int[i+1];
    newRow[0] = newRow[i] = 1;
    for(int m=1; m<=(row.length)/2; m++){
      newRow[m] = newRow[(newRow.length)-(m+1)] = row[m-1] + ((m==((row.length/2)+1))? 0: row[m]);
    }
    result[i] = newRow;
    row = newRow;
  }
  return result;
}
    
}
