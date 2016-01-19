import java.util.Scanner;

public class Primzahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner s = new Scanner(System.in);
		System.out.println("Schranken eingeben ");
		N = s.nextInt();
		s.close();
		
		
		boolean[] isPrim = new boolean[N];
		isPrim[0] = false;
		for(int c = 1; c < N; c++)
		{
			isPrim[c] = true;
		}
		
		for (int i = 2; i <= N; i++)
		{
			if (isPrim[i-1])
			{
				System.out.println(i);
				
				
				for (int j = 2*i; j <= N; j += i)
				{
					isPrim[j-1] = false;
				}
			}
		}
	}

}
