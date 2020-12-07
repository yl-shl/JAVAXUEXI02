package APP;

public class APP {
	public static void main(String[] args) {
	int array2d[][]={
			{1,2,3,4,5,6},
			{7,8,9,10,0,12},
			{8,8,9,10,11,12},
			{7,8,3,10,11,12},
			{88,66,92,102,151,999},
	};
  		new Find().findZero(array2d);
		System.out.println();
		new Find().Findleft(array2d);
		System.out.println();
		new Find().Findright(array2d);
		System.out.println();
		new Find().Findup(array2d);
		System.out.println();
		new Find().Finddown(array2d);
		System.out.println();
	}
}
