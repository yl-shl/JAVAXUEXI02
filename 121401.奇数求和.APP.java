package Java12;

public class APP2 {public static void main(String[] args) {
	Long i=1L;
	Long sum=0L;
	long big=2147483647L;
	while (i<=big) {
		if(i % 2==1){
			sum=sum+i;
		}
		i++;
	}
	System.out.println("sum="+sum);
}

}
