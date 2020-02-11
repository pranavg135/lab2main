package Lab2_Exercise;

import java.util.Scanner;

public class Client {
	
	static Scanner sc = new Scanner(System.in);
	
	Book book;
	JournalPaper journal;
	Video video;
	CD cd;
	
	void setBookData(String title,int id,int copies)
	{
		book= new Book(title,id,copies);
		System.out.println("Enter author name");
		book.setAuthor(sc.next());
	}
	void getBookData()
	{
		System.out.println("Book Title: "+book.getTitle());
		System.out.println("Book Id: "+book.getId());
		System.out.println("No. of copies: "+book.getCopies());
		System.out.println("Author name: "+book.getAuthor());
	}
	
	
	void setJournalData(String title,int id,int copies)
	{
		journal= new JournalPaper(title,id,copies);
		System.out.println("Enter author name");
		journal.setAuthor(sc.next());
		System.out.println("Enter date: ");
		journal.setDate(sc.nextInt());
	}
	void getJournalData()
	{
		System.out.println("Book Title: "+journal.getTitle());
		System.out.println("Book Id: "+journal.getId());
		System.out.println("No. of copies: "+journal.getCopies());
		System.out.println("Author name: "+journal.getAuthor());
		System.out.println("Date of publication: "+journal.getDate());
	}
	
	
	void setVideoData(String title,int id,int copies)
	{
		video= new Video(title,id,copies);
		System.out.println("Enter runtime ");
		video.setRuntime(sc.nextInt());
		System.out.println("Enter director ");
		video.setDirector(sc.next());
		System.out.println("Enter genre ");
		video.setGenre(sc.next());
		System.out.println("Enter year ");
		video.setYear(sc.nextInt());
		
	}
	void getVideoData()
	{
		System.out.println("Book Title: "+video.getTitle());
		System.out.println("Book Id: "+video.getId());
		System.out.println("No. of copies: "+video.getCopies());
		System.out.println("Runtime: "+video.getRuntime());
		System.out.println("Director: "+video.getDirector());
		System.out.println("Genre: "+video.getGenre());
		System.out.println("Year: "+video.getYear());
	}
	
	
	void setCdData(String title,int id,int copies)
	{
		cd= new CD(title,id,copies);
		System.out.println("Enter runtime ");
		cd.setRuntime(sc.nextInt());
		System.out.println("Enter genre ");
		cd.setGenre(sc.next());
		System.out.println("Enter artist ");
		cd.setArtist(sc.next());
		
	}
	void getCdData()
	{
		System.out.println("Book Title: "+cd.getTitle());
		System.out.println("Book Id: "+cd.getId());
		System.out.println("No. of copies: "+cd.getCopies());
		System.out.println("Runtime: "+cd.getRuntime());
		System.out.println("Artist: "+cd.getArtist());
		System.out.println("Genre: "+cd.getGenre());
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cl= new Client();
		
		System.out.println("Enter your Choice");
		System.out.println("1. Book");
		System.out.println("2. JournalPaper");
		System.out.println("3. Video");
		System.out.println("4. CD");
		
		int n=sc.nextInt();
		System.out.println("Enter title");
		String title=sc.next();
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter copies");
		int copies=sc.nextInt();
		if(n==1)
		{
			cl.setBookData(title, id, copies);
			cl.getBookData();
		}
		else if(n==2)
		{
			cl.setJournalData(title, id, copies);
			cl.getJournalData();
		}
		else if(n==3)
		{
			cl.setVideoData(title, id, copies);
			cl.getVideoData();
		}
		else if(n==4)
		{
			cl.setCdData(title, id, copies);
			cl.getCdData();
		}
		else
			System.out.println("Wrong choice");
			

	}

}
