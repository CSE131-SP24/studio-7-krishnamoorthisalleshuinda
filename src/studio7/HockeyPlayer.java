package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jerseynumber;
	private String hand;
	private String shootsdirection;
	private static int games = 0;
	private int assists;
	private int goals;
	
	public HockeyPlayer(String initname, int initjerseynumber, String inithand, String initshootsdirection) {
		
		name = initname;
		jerseynumber = initjerseynumber;
		hand = inithand;
		shootsdirection = initshootsdirection;
		
	}
	
	public String NJM() {
		
		String temp = "";
		temp += name;
		temp += ", jersey number ";
		temp += jerseynumber;
		temp += ", ";
		temp += hand;
		temp += ", ";
		temp += shootsdirection;
		return temp;
		
	}
	
	public String gameStats(int goals1, int assists1) {
		games += 1;
		goals += goals1;
		assists += assists1;
		String temp = "";
		temp += name + " had ";
		temp += goals1;
		temp += " goals and ";
		temp += assists1;
		temp += " assists this game.";
		return temp;
	}
	
	public String gamesPlayed() {
		String temp = "";
		temp += name + " has played ";
		temp += games;
		temp += " games.";
		return temp;
	}
	
	public String GoalsandAssists() {
		String temp = "";
		temp += (name + " has ");
		temp += goals;
		temp += " total goals and ";
		temp += assists;
		temp += " total assists.";
		return temp;
	}
	
	public String Points() {
		int totalPoints = goals + assists;
		String temp = "";
		temp += name + " has ";
		temp += totalPoints;
		temp += " total Points.";
		return temp;
	}
	
	public static void main(String[] args) {
		
		HockeyPlayer h1 = new HockeyPlayer("Adrien Abney", 29, "right-handed", "shoots right");
		System.out.println(h1.NJM());
		System.out.println(h1.gameStats(15, 24));
		System.out.println(h1.gameStats(3, 2));
		System.out.println(h1.gameStats(40, 1));
		System.out.println(h1.gamesPlayed());
		System.out.println(h1.GoalsandAssists());
		System.out.println(h1.Points());
		
	}


}
