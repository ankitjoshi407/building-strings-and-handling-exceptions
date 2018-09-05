import java.util.Scanner;

class checkoccurence
{
	public static void main(String[] x)
	{
		String str,substr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		str = sc.nextLine();
		
		System.out.print("Enter a string to search: ");
		substr = sc.nextLine();
		
		System.out.println("\nThe entered string : " + str);
		
		int l1 = str.length();
		int l2 = substr.length();
		int limit = l1 - l2;
		boolean found = false;
		
		System.out.println("** Searching... **");
		
		for(int i=0;i<=limit;i++)
		{
			String txt = str.substring(i,i+l2);
			// System.out.println("// i = "+i+"\t"+txt);
			if(txt.equals(substr))
			{
				System.out.println("// Found '" + txt + "' at pos = " + i);
				found = true;
			}
		}
		System.out.println("** Done **");
		if(found == false)
			System.out.println("\nNot found.");
		
		sc.close();
	}
}