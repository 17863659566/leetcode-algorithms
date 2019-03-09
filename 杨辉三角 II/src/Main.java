import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		getRow(3);

	}
	
    public static List<Integer> getRow(int rowIndex) {
    	int[][] array = new int[rowIndex+1][rowIndex+1];
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i = 0;i < rowIndex+1;i++) {
    		array[i][0] = 1;
    		array[i][i] = 1;
    	}
    	for(int i = 2; i < rowIndex+1;i++) {
    		for(int j = 1; j <=i;j++) {
    			array[i][j] = array[i-1][j-1] + array[i-1][j];
    		}
    	}
    	for(int i = 0; i < rowIndex+1;i++)
    		list.add(array[rowIndex][i]);
    
    	return list;
    	
    }

}
