
public class Primzahlen {

	public static void main(String[] args)
	{
		int zahl;
		int schranke = 100000;
		int divident;
		int zähler;
		
		for(zahl = 1; zahl <= schranke; zahl ++)
		{
			if(zahl != 1)
			{
				divident = 0;
				for (zähler = 1; zähler <= zahl; zähler ++)
				{
					if(zahl % zähler == 0)
					{
						divident++;
					}
				}
				if(divident == 2)
				{
					System.out.println(zahl);
				}
			}
		}
	}
}
