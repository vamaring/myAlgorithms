package myJavaLearning;

public class zeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int[][]{ 
				{1,0,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		printArray(matrix);
		
		
		//System.out.println(matrix.length);
		
		checkRowColumn(matrix);
		System.out.println();
		printArray(matrix);
	}
	
	static void checkRowColumn(int[][] arr) {
		boolean row[] = new boolean[arr.length];
		boolean col[] = new boolean[arr[0].length];
		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
					
			}
		}
		
		for (int i=0; i < row.length; i++)
			if (row[i]) nullifyRow(arr,i);
		
		for (int j=0; j < col.length; j++)
			if (col[j]) nullifyColumn(arr,j);
	}

	private static void nullifyColumn(int[][] arr, int col) {
		// TODO Auto-generated method stub
		
		for (int i=0; i < arr.length; i++)
			arr[i][col] = 0;
	}

	private static void nullifyRow(int[][] arr, int row) {
		// TODO Auto-generated method stub
		for (int j=0; j < arr[0].length; j++)
			arr[row][j] = 0;
	}

	static void printArray(int[][] input)
	{
		for (int i=0; i < input[0].length; i++)
		{
			for (int j=0; j < input.length; j++)
			{
				System.out.print(input[i][j] + " ");
			}
		
		System.out.println();
		
		}
	}
	
	
}
