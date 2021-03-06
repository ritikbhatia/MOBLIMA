package views;
import java.io.*;
import java.util.*;
//import models.*;
import controllers.*;
/**
 * View to create a movie
 * @author Anon
 *
 */
public class CreateMovie {
	/**
	 * Main function to drive the view
	 * @param args null argument used to start the function
	 * @throws IOException Throws IOException
	 * @throws Exception Throws Exception
	 */
	public static void main(String[] args) throws IOException,Exception {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Movie Name
		 * Movie Type
		 * Showing status of the movie
		 * Age restriction of the movie
		 * Synopsis of the movie
		 * Director of the movie
		 * Boolean value depicting if the movie is 3D or not
		 * Actors in the movie
		 * Temporary variable
		 * Temporary variable
		 */
		
		String movieName;
		String movieType;
		String movieStatus; // can convert it to int and specify each int's meaning
		String movieRating;// rating can be out of 10 or 100
		String movieSynopsis;
		String movieDirector;
		boolean is3D;
		String[] movieCast; // need to have 2 or more cast members of the movie
		String temp; String tempString;
		
		System.out.println("-----------------------------------");
		System.out.println("Create Movie");
		System.out.println("-----------------------------------");
		
		System.out.print("Movie Name: ");
		movieName = sc.nextLine();
		
		System.out.println();
		System.out.println("Is the movie 3D?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		System.out.println("Enter your option:");
		temp = sc.nextLine();
		
		switch(Integer.valueOf(temp)) {
		case 1: is3D = true; break;
		case 2: is3D = false; break;
		default: is3D = false;
		}
		
		
		System.out.println();
		System.out.println("Movie Type:");
		System.out.println("1: Blockbuster");
		System.out.println("2: Action");
		System.out.println("3: Drama");
		System.out.println("4: Comedy");
		System.out.println("5: Horror");
		temp = sc.nextLine();
		switch(Integer.valueOf(temp)) {
		case 1: movieType = "Blockbuster"; break;
		case 2: movieType = "Action"; break;
		case 3: movieType = "Drama"; break;
		case 4: movieType = "Comedy"; break;
		case 5: movieType = "Horror"; break;
		default: movieType = "Not defined"; 
		}
		
		
		System.out.println();
		System.out.println("Movie Status: ");
		System.out.println("1: Coming soon!");
		System.out.println("2: Preview");
		System.out.println("3: Now showing");
		System.out.println("4: End of showing");
		temp = sc.nextLine();
		switch(Integer.valueOf(temp)) {
		case 1: movieStatus = "Coming soon!"; break;
		case 2: movieStatus = "Preview"; break;
		case 3: movieStatus = "Now showing"; break;
		case 4: movieStatus = "End of showing"; break;
		default: movieStatus = "Not defined"; 
		}
		
		System.out.println();
		System.out.println("Movie Rating: ");
		System.out.println("1: G");
		System.out.println("2: PG13");
		System.out.println("3: R");
		temp = sc.nextLine();
		switch(Integer.valueOf(temp)) {
		case 1: movieRating = "General"; break;
		case 2: movieRating = "PG13"; break;
		case 3: movieRating = "Restricted"; break;
		default: movieRating = "Not defined";
		}
		
		System.out.println();
		System.out.println("Movie Director: ");
		movieDirector = sc.nextLine();
		
		System.out.println();
		System.out.println("Movie Cast (Separate cast by commas): ");
		tempString = sc.nextLine();
		movieCast = tempString.split("\\s*,\\s*");
		
		System.out.println();
		System.out.print("Movie Synopsis: ");
		movieSynopsis = sc.nextLine();
		
		MovieCreate.WriteMovie(movieName, movieType, movieStatus, movieRating, movieSynopsis, movieDirector, movieCast, is3D);
		System.out.println();
		AdminFunctions.main(null);
	}

}
