import java.util.Scanner;

class vowels
{
	public static void main(String[] x)
	{
		StringBuffer str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		str = new StringBuffer(sc.nextLine());
		System.out.println("\nThe entered string : " + str);
		
		System.out.println("** Removing all vowels... **");
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
			 || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				System.out.println("// Removing '" + str.charAt(i) + "'");
				str.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("** Done **");
		System.out.println("\nThe final string : " + str + "\n");
		sc.close();
	}
}