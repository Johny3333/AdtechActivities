package Tasks;
import java.util.*;
public class ListInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>li = new ArrayList<Integer>();
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Innings");
        int n=s.nextInt();
        int j=0;
        while(j<n)
        {
        	int i=s.nextInt();
        	li.add(i);
        	j++;
        }
        int count50=0;
        int count100=0;
        for(int i=0;i<li.size();i++)
        {
        	if(li.get(i)>=50 && li.get(i)<100)
        	{
        	count50++;	
        	}
        	else if(li.get(i)>=100)
        	{
        		count100++;
        	}
        }
        System.out.println("Chris Gayle scored"+" "+count50+" "+"fifties");
        System.out.println("Chris Gayle scored"+" "+count100+" "+"hundreds");
	}

}
