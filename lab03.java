import java.util.Scanner;
public class lab03{
	public static void main (String[] args){
	int userNum, sum=0, count=0;
	Scanner scan = new Scanner (System.in);

	System.out.println("Enter an integer.");
	userNum = scan.nextInt();

	if (userNum < 2)
	{
	  System.out.println("The integer value must be greater than 1");
	}
else
{
	
   switch (userNum % 2)
    {	
	case 0:
	while(userNum >= 2)
	{
	  sum += userNum;
	  userNum = userNum - 2;
	  count ++;
	}
System.out.print(sum);
        break;
 	
	default:
     
	userNum = userNum -1;
	while(userNum >= 2)
	{
	  sum += userNum;
	  userNum = userNum - 2;
	  count ++;
        }
System.out.print(sum);
    }
}
	

}
}