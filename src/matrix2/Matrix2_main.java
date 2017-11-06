package matrix2;

import java.util.Arrays;

public class Matrix2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[][] = { {0, 1}, {2, 0}, {0, 3} };
		double b[][] = { {1, -1, 2}, {3, 0, 4} };
		Matrix2_lib mlib = new Matrix2_lib(a, b);
		System.out.println("Product = "+Arrays.deepToString(mlib.getProduct()));
		
		System.out.println("Transpose = "+Arrays.deepToString(mlib.getTranspose(b)));
	}

}
