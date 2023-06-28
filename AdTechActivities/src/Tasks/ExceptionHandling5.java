package Tasks;
import java.util.*;
public class ExceptionHandling5 {

	public static void main(String[] args)throws InvalidCredentials {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         System.out.println("Enter User Name:");
       String userName=s.next();
         System.out.println("Enter Password");
         String password=s.next();
         if(userName.equals("Johny")&& password.equals("1234")) {
        	 System.out.println("Welcome Back Johny");
         }
         else
         {
        	 throw new InvalidCredentials ();
         }
	}

}
class InvalidCredentials extends Exception
{
	InvalidCredentials ()
	{
		System.out.println("Your UserName or Password is INCORRECT");
	}
}