package Tasks;
import java.util.*;
public class ListInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List li = new ArrayList();
          Scanner s = new Scanner(System.in);
          System.out.println("Enter Teams");
          String team1=s.next();
          String team2=s.next();
          String team3=s.next();
          String team4=s.next();
          String team5=s.next();
          li.add(team1);
          li.add(team2);
          li.add(team3);
          li.add(team4);
          li.add(team5);
          System.out.println("Enter Swap Position");
          int pos=s.nextInt();
          Collections.swap(li,0,pos);  
          for(int i=0;i<li.size();i++)
          {
        	  System.out.println(li.get(i));
          }
	}

}
