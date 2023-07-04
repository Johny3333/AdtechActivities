package Tasks;
import java.util.*;

public class CRUD_APPLICATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootballClubs f1= new FootballClubs("Real Madrid",14,"Cristiano Ronaldo");
		FootballClubs f2= new FootballClubs("FCBarcelona",5,"Lionel Messi");
		FootballClubs f3= new FootballClubs("Man City",1,"Erling Haaland");
		System.out.println("1. Read a  FootballClub");
		System.out.println("2. Insert a  FootballClub");
		System.out.println("3. Update a  FootballClub");
		System.out.println("4. Delete a  FootballClub");
		Scanner s= new Scanner(System.in);
		System.out.println("Select Your Option");
		int options=s.nextInt();
		Map<Integer,FootballClubs> map = new HashMap<Integer,FootballClubs>();
		map.put(1,f1);
		map.put(2,f2);
		map.put(3,f3);
		switch(options)
		{
		case 1:
			System.out.println("Your Selected Option is Read a FootballClub");
			System.out.println("Enter FootballClub RecordNumber");
			int record=s.nextInt();
			System.out.println(map.get(record));
			
			break;
		case 2:
			System.out.println("Your Slected Option is Insert a FootballClub");
			System.out.println("Enter FootballClub RecordNumber");
			int recordn=s.nextInt();
			System.out.println("Enter Team Name");
			String name=s.next();
			System.out.println("Enter number of Champions Trophies");
			int trophies=s.nextInt();
			System.out.println("Enter Best Player");
			String bestplayer = s.next();
			FootballClubs f4= new FootballClubs(name,trophies,bestplayer);
			map.put(recordn,f4);
			System.out.println("After Inserting Records are:");
			System.out.println(map);
			break;
		case 3:
			System.out.println("Your Slected Option is Update a FootballClub");
			System.out.println("Select a FootballClub to Update");
			int select =s.nextInt();
			
			
			
			    	  System.out.println("Enter Team Name");
			    	  String team=s.next();
			    	  System.out.println("Enter Number of trophies");
			    	  int trop=s.nextInt();
			    	  System.out.println("Enter Best Player");
			    	  String bestPlaye=s.next();
			    	  FootballClubs f= new FootballClubs(team,trop,bestPlaye);
			    	  map.put(select,f);
			      
			
			
			System.out.println("After Updating");
			System.out.println(map);
			break;
		case 4:

			System.out.println("Your Option is to delte a Team");

			System.out.println("Select team to delete");
			int delete=s.nextInt();
			map.remove(delete);

			System.out.println("After Removing");
			System.out.println(map);
			break;
		}

	}

}
class FootballClubs{
	private String teamName;
	private int numberOfChampionTrophies;
	private String bestPlayer;
	FootballClubs(String TN,int nofCT,String bestplayer)
	{
		this.teamName=TN;
		this.numberOfChampionTrophies=nofCT;
		this.bestPlayer=bestplayer;
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumberOfChampionTrophies() {
		return numberOfChampionTrophies;
	}

	public void setNumberOfChampionTrophies(int numberOfChampionTrophies) {
		this.numberOfChampionTrophies = numberOfChampionTrophies;
	}

	public String getBestPlayer() {
		return bestPlayer;
	}

	public void setBestPlayer(String bestPlayer) {
		this.bestPlayer = bestPlayer;
	}

	@Override
	public String toString() {
		return "FootballClubs [teamName=" + teamName + ", numberOfChampionTrophies=" + numberOfChampionTrophies
				+ ", bestPlayer=" + bestPlayer + "]";
	}
	
}
