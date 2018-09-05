class substrings
{
	public static void main(String[] x)
	{
		String str = "Hello";
		int i,j,k=1,len = str.length();
		
		System.out.println("Substrings of string = \"" + str + "\":-");
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
			{
				System.out.println(k + ". " + str.substring(i,j+1));
				k++;
			}
		}
		System.out.println();
	}
}