
public class Main {

	public static void main(String[] args) {

	}
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        for(int i = 0; i < numbers.length;i++) {
        	for(int j = i + 1; j < numbers.length;j++) {
        		if(numbers[i] + numbers[j] == target) {
        			array[0] = i + 1;
        			array[1] = j + 1;
        		}
        	}
        	 if(array[0] != array[1])
             	return null;
        }
        if(array[0] == array[1])
        	return null;
        return array;
    }

}
