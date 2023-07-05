package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li= new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name");
		String name=s.next();
		System.out.println("Enter Player Age");
		int age=s.nextInt();
		System.out.println("Enter Country");
		String country=s.next();
		System.out.println("Player Details:");
		li.add(name);
		li.add(age);
		li.add(country);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("Slect Skill:");
		System.out.println("1.Batsman");
		System.out.println("2.Bowler");
		System.out.println("3.AllRounder");
		System.out.println("4.Wicket Keeper");
		String skill=s.next();
		System.out.println("Enter the position to add the skill:");
		int pos = s.nextInt();
		li.add(pos,skill);
		System.out.println("Player Details:");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("Enter the position of the detail to be removed");
		int posd=s.nextInt();
		li.remove(posd);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
	}

}
