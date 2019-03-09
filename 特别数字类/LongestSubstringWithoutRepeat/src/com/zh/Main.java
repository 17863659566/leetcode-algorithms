package com.zh;

public class Main {
	public static void main(String[] args) {
		SubstringWithoutRepeat withoutRepeat = new SubstringWithoutRepeat();
		int answer = withoutRepeat.answer("abcabc");
		System.out.println(answer);
	}
	
	
	

}

class SubstringWithoutRepeat{
	int answer(String str) {
		//无论什么题，对于引用一定要判别
		if(str == null || str.length() <= 0)
			return 0;
		//visited数组用于标记字符串中出现的字符
		int[] visited = new int[256];
		//用于临时记录子串的长度
		int cur_len = 1;
		//用于记录最大长度
		int max_len = 1;
		//用于查看是否当前字符已经存在子串中
		int prev;
		//将所有的字符都初始化为无重复状态
		for(int i = 0; i < visited.length;i++)
			visited[i] = -1;
		//标记第一个的下标
		visited[str.charAt(0)] = 0;
		//重复比较当前长度和最大长度
		for(int i = 1; i < str.length();i++) {
			prev = visited[str.charAt(i)];
			if(prev == -1 || i - prev > cur_len)
				cur_len++;	
			else {
				if(max_len < cur_len)
					max_len = cur_len;
				cur_len = i - prev;
			}
			visited[str.charAt(i)] = i;
		}
		
		if(cur_len > max_len)
			max_len = cur_len;
		return max_len;
	}
}
