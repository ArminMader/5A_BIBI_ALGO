
public class Primzahlen {

	public static void main(String[] args)
	{
		int zahl;
		int schranke = 100000;
		int divident;
		int z�hler;
		
		for(zahl = 1; zahl <= schranke; zahl ++)
		{
			if(zahl != 1)
			{
				divident = 0;
				for (z�hler = 1; z�hler <= zahl; z�hler ++)
				{
					if(zahl % z�hler == 0)
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
