/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

/**
 *
 * @author kgm03
 */
    import java.util.ArrayList;



public class PlayerManager2 

{

	//Declare the arraylist

	static ArrayList<NFLPlayer> playerArray = new ArrayList<>();

	

	//Constructor

	public PlayerManager2()

	{

		CreatePlayers();

	}

	

	//Method to create the players

	public void CreatePlayers()

	{

		playerArray.add(new OffensivePlayers("Tom Brady", "QB","San Mateo, CA", "Michigan", "19th Season", "Serra HS", "New England Patriots", "6ft 4in", 225, 40, 12, true, 89, 139, 64.0, 46.3, 1132, 8.1, 377.3, 8, 0, 4, 108.6,0));

		playerArray.add(new OffensivePlayers("Todd Gurley", "RB",  "Baltimore, MD", "Georgia", "4th Season", "Tarboro HS", "Los Angeles Rams", "6ft 1in", 227, 23, 30, true, 0, 14, 0, 14, 101, 7.2, 101.0, 0, 0, 0, 0, 0));

		playerArray.add(new OffensivePlayers("Julio Jones", "WR", "Foley, AL", "Alabama", "8th Season", "Foley HS", "Atlanta Falcons", "6ft 3in", 220, 29, 11, true, 0, 0, 0, 0, 195, 10.8, 97.5, 1, 0, 0, 0, 18));

		playerArray.add(new DefensivePlayers("Zach Ertz","TE","Orange, CA", "Stanford" , "6th Season", "Monte Vista HS", "Philadelphia Eagles", "6ft 5in", 250,27, 86, true, 0, 0, 0, 18, 192, 1, 0, 10.7, 64.0));

		playerArray.add(new DefensivePlayers("Trey Flowers","DE", "Huntsville, AL", "Arkansas", "4th Season", "Columbia HS", "New England Patriots", "6ft 2in", 265, 24 , 98, true, 17, 10, 7, 0, 0, 0, 1.0, 0, 0));

		playerArray.add(new DefensivePlayers("Patrick Chung","DB", "Kingston Jamaica", "Oregon", "10th Season", "Rancho Cucamonga HS", "New England Patriots", "5ft 11in", 215,30, 23, true, 22, 15, 7, 0, 0, 0, 0, 0, 0));

	}

	//toString method

	public String toString() 

	{

		String i = "";

		for (NFLPlayer N : playerArray)

			i += ("Player" + playerArray.indexOf(N)+ " Name: " + N.name + " " + "Position: " + N.position + " Age: " + N.age + " Plays for: " + N.team + "\n");

		return i;

	}

	

	//method "driver" to test the class

	public static void main(String[]args)

	{

		PlayerManager m = new PlayerManager();

		System.out.println("The 6 first players that have been created are:");

		System.out.println(m.toString());

		

	}
}
