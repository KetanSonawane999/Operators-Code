import java.util.Scanner;

class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);

		String op = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' 
			|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?
			(ch+" is Vowel"):(ch+ " is Consonet");
		System.out.println(op);
	}
}
