package JAVA2;

import java.util.Scanner;

public class APP4 {public static void main(String[] args) {
	System.out.println("请输入年份");
	int year;
	Scanner scanner=new Scanner(System.in);
	year=scanner.nextInt();
	if (year<0||year>3200) {
		System.out.println("年份错误！");
	}
	if (year<3200||year>-3200||year%4==0 && year%100!=0 || year%400==0) {
		System.out.println(year+"是闰年");
	}else {
		System.err.println(year+"不是闰年");
	}
}

}
