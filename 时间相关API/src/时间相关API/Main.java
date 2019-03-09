package 时间相关API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
          Date date = new Date();
          /**
           * SimpleDateFormat常用的参数
           *     yyyy-MM-dd hh:mm:ss 格式化为年月日时分秒
           *     y  输出四位数年份
           *     m  获取月
           *     d  获取日
           *     E  获取星期几
           *     D  一年中的第几天
           *     F  一年中的第几周的周几
           *     w(小写)  一年中的第几周
           *     W(大写)  一月中的第几周
           */
          SimpleDateFormat format = new SimpleDateFormat("E");
          String string = format.format(date);
          System.out.println(string);
	}

}
