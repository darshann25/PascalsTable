package pascalstable;

/**
 *
 * @author darshanpatel
 */
public class PascalsTable {

    public static void main(String[] args) {
<<<<<<< fef7f36e4ac9d7e9586dc04b43185d6b673700cb
        final int SIZE_OF_PASCAL_TABLE = 3;
=======
        final int SIZE_OF_PASCAL_TABLE = 0;
>>>>>>> Fix for edge case when input is zero
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
  if (value != 0){
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
  } else {
      System.out.println("Input cannot be zero!");
  }
  return result;
}
    
}
