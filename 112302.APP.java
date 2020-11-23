package j112301;

import java.util.Scanner;

public class App3 {public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{5,80},
			{300,600},
			{900,8},
			{10,100},
	};
	while (true) {
		Thread.sleep(10000);
		System.out.println("一秒已经过去了");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		
	}
}

}
