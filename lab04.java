import java.util.Scanner;
public class lab04{
	public static void main(String[] args){
int Acount=0, Ecount=0, Icount=0, Ocount=0, Ucount=0, nonVowelCount=0;
String userString;
Scanner scan = new Scanner (System.in);

System.out.println("Enter a string."); 

userString = scan.nextLine();
userString=userString.toLowerCase();

for(int i=0; i<userString.length(); i++)
{

 switch(userString.charAt(i))
{
	case 'a': 
		Acount ++;
		break;
	case 'e':
 		Ecount ++;
		break;
	case 'i': 
		Icount ++;
		break;
	case 'o': 
		Ocount ++;
		break;
	case 'u':
 		Ucount ++;
		break;
	default:
		nonVowelCount ++;
		break;
}
}
 System.out.println("a: " + Acount);
 System.out.println("e: " + Ecount);
 System.out.println("i: " + Icount);
 System.out.println("o: " + Ocount);
 System.out.println("u: " + Ucount);
 System.out.println("nonvowels: " + nonVowelCount);

}
}