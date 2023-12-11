/*
 * Written by Andrew Davison
 */
import java.util.Random;
public class FlipMatrix {

	public static final int SIZE = 10;
	public static void main(String[] args) {
		Random r = new Random();
		int[][] m = new int[SIZE][SIZE];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = r.nextInt(SIZE);
			}
		}
		
		//flip matrix
		int[][] mFlip = new int[SIZE][SIZE];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length/2;j++)
			{
				int temp = m[i][j];
				mFlip[i][j] = m[i][m.length-j-1];
				m[i][m.length-j-1] = temp;
			}
		}
		
		//print matrix
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
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(mFlip[i][j]+" ");
			}
			System.out.println();
		}

	}

}
