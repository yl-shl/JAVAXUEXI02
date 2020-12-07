package APP;

public class Find {
//R_zero(x,y)=(column,row)=R_zero(1,4);
//	R_left(x,y)=(column,row)=R_left(1,3);
//	R_right(x,y)=(column,row)=R_right(1,5);
//	R_up(x,y)=(column,row)=R_up(0,4);
//	R_down(x,y)=(column,row)=R_down(2,4);
	int leftX,leftY,rightX,rightY,upX,upY,downX,downY;
	void findZero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.print("R_zero("+column+","+row+")");	
				}
			}
	}
	}
	
	void Findleft(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					leftX=column-1;
					leftY=row;
					System.out.print("R_left("+leftX+","+leftY+")");	
				}
			}
	}
	}
	

	void Findright(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					rightX=column+1;
					rightY=row;
					System.out.print("R_right("+rightX+","+rightY+")");	
				}
			}
	}
	}
	

	void Findup(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					upX=column;
					upY=row-1;
					System.out.print("R_up("+upX+","+upY+")");	
				}
			}
	}
	}
	

	void Finddown(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					downX=column;
					downY=row+1;
					System.out.print("R_down("+downX+","+downY+")");	
				}
			}
	}
	}
}
