
public class Main {

	public static void main(String[] args) {
		int k,m;
		for(int i = 0; i < 1000;i++) {
			int j = i + 100;
			k = (int)Math.sqrt(j);   //关键在平方的判断方法
			if(j == k * k) {
				j += 168;
				m = (int)Math.sqrt(j);
				if(j == m * m)
					System.out.println(i);
				
			}
		}

	}

}
