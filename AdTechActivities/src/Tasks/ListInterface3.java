package Tasks;
import java.util.*;
public class ListInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             List li1= new ArrayList();
             List li2= new ArrayList();
             System.out.println("Enter Top 5 Scorers from ipl 12 Season");
             Scanner s = new Scanner(System.in);
             String player1=s.next();
             String player2=s.next();
             String player3=s.next();
             String player4=s.next();
             String player5=s.next();
             li1.add(player1);
             li1.add(player2);
             li1.add(player3);
             li1.add(player4);
             li1.add(player5);
             System.out.println("Enter Top 5 Scorers from ipl 13 Season");
             String player01=s.next();
             String player02=s.next();
             String player03=s.next();
             String player04=s.next();
             String player05=s.next();
             li2.add(player01);
             li2.add(player02);
             li2.add(player03);
             li2.add(player04);
             li2.add(player05);
             li2.retainAll(li1);
             for(int i=0;i<li2.size();i++) {
            	 System.out.println(li2.get(i));
             }
	}

}
