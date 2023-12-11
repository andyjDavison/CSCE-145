/*
 * Written by Andrew Davison
 */
import java.util.Random;
public class MatrixFlipper {

	public static final int SIZE = 10;
	public static final int NUM_RNG = 10;
	public static void main(String[] args) {
		Random r = new Random();
		int[][] m = new int[SIZE][SIZE];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = r.nextInt(NUM_RNG);//fill new array with random numbers from 0 to 9
			}
		}
	
		//flip matrix
		int[][] mFlip = new int[SIZE][SIZE];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length/2;j++)
			{
				int temp = m[i][j];
				mFlip[i][j] = m[i][m.length-j-1];//flips first value with last value, and then gets one closer to middle every time
				mFlip[i][m.length-j-1] = temp;
			}
		}
		
		//print
		System.out.println("Created Matrix");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nFlipped Matrix");
		for(int i=0;i<mFlip.length;i++)
		{
			for(int j=0;j<mFlip[i].length;j++)
			{
				System.out.print(mFlip[i][j]+" ");
			}
			System.out.println();
		}

	}

}
