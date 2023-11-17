package homework5;
import java.util.*;
public class MainMusic {

	public static void main(String[] args) {
		ArrayList<Music> songs = new ArrayList<>();
		System.out.println("This are Vietnamese songs");
		songs.add(new Music("A lot of money for what?", "Gducky", 3.5, 5));
		songs.add(new Music("Rich by friends, wealth by wife", "MCK", 3.41, 4.8));
		songs.add(new Music("Who is that?", "Typh 16", 3.26, 4.5));
		songs.add(new Music("Run!", "Gducky ft. TEZ", 3.37 , 4.9));
		songs.add(new Music("Sand, gold dust", "Gonzo ft. Draw", 3.17, 4.2));
		songs.add(new Music("Honest", "Draw", 3.12, 4.4));
		songs.add(new Music("Eyes", "Gducky", 2.39, 4.9));
		
		//Sort the tracks alphabetically by title. Use Comparable<T> interface.
		System.out.println("A. Sort the tracks alphabetically by title");
		Collections.sort(songs);
		for (int i=0; i<songs.size(); i++)	{
			System.out.println("\t" +(i+1) + ": " + songs.get(i).toString());
		}
		
		//Sort the tracks by rating in descending order. Use here Comparator<T> interface.
		System.out.println("B. Sort the tracks by rating in descending order");
		Collections.sort(songs, new Comparator<Music>() {

			@Override
			public int compare(Music s1, Music s2) {
				return Double.compare(s2.getRating(), s1.getRating());
			}
		});
		for (int i=0; i<songs.size(); i++)	{
			System.out.println("\t" +(i+1) + ": " + songs.get(i).toString());
		}
		
		//Sort the tracks alphabetically by artist. Use here lambda expression.
		System.out.println("C. Sort the tracks alphabetically by artist");
		songs.sort((s1, s2) -> s1.getArtist().compareToIgnoreCase(s2.getArtist()));
		for (int i=0; i<songs.size(); i++)	{
			System.out.println("\t" +(i+1) + ": " + songs.get(i).toString());
		}
		
		//Choose the tracks of the selected artist and sort those by duration in ascending order.
		//Use here Stream API.
		System.out.println("D. Choose the tracks of the selected artist and sort those by duration in ascending order");
		System.out.println("Choose the artist:");
		Scanner Name = new Scanner(System.in);
		String name = Name.nextLine();
		
		ArrayList<Music> alist = new ArrayList<>();
		for (Music Songs:songs) {
			boolean check = Songs.getArtist().matches("(?i).*" + name + ".*");
			if (check == true)	{
				alist.add(Songs);
			}
		}
		
		alist.stream()
			.sorted((s1,s2) -> Double.compare(s1.getDuration(), s2.getDuration()))
			.forEach(song -> System.out.println("\t" + song.toString()));
		
	}

}