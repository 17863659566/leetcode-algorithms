package 阶乘后的零;

public class Main {

	public static void main(String[] args) {
	

	}
	//判断阶乘中有几个是二的倍数同时是5的倍数
 /* 算法会超时 
  * public int trailingZeroes(int n) {
	   int twoNumber = 0;
	   int fiveNumber = 0;
        for(int i = 0; i <n;i++) {
        	int k = i;
        	while(k % 2 == 0 || k % 5 == 0) {
        		if(k % 2 == 0) {
        			twoNumber++;
        			k /= 2;
        		}
        			
        		if(k % 5 == 0) {
        			fiveNumber++;
        			k /= 5;
        		}		
        	}
        }
       return twoNumber > fiveNumber ? fiveNumber : twoNumber;
    }
   */
   public int trailingZeroes(int n) {
       int ans = 0;
       while(n > 0){
           n /= 5;
           ans +=n;
       }
       return ans;
    }

}
