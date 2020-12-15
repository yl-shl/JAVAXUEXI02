package Java12;

import java.util.Scanner;

public class APP {
	 public static long fibonacci(long number) {
    if ((number == 0) || (number == 1))
        return number;
    else
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
    	System.out.println("用户输入：");
    	Scanner scanner=new Scanner(System.in);
    	int n=scanner.nextInt();
    	if (0<n && n<=40) {
    		System.out.printf("Fibonacci of %d is: %d\n",n, fibonacci(n));
		}else {
			System.err.println("输入错误！");
		}
    }
}
