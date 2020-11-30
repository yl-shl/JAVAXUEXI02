package java113002;

public class APP3 implements R2{
	public  void main(String[] args) {
		System.out.println(R2.boy_filePath);
		System.out.println(R2.girl_filePath);
		int[][]array2d={
				{1,2},
				{3,4},
				{5,6},
		};
		for (int row = 0; row < array2d.length; row++) {
			for (int colum = 0; colum < array2d[0].length; colum++) {
				System.out.print(array2d[row][colum]+" ");
			}
			System.out.println(array2d);
		}
		
	}
