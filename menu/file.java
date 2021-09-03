package menu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file{
	
	private static String path = System.getProperty ( "user.dir" ) + "/data/";
	
	public static void editFile ( int rid, String name,String id, String work, int amount ){
		try{
			File resFile = new File ( path + rid + ".txt" );
			
			if( !resFile.exists() ){
				resFile.createNewFile();
				FileWriter file=new FileWriter( resFile );
				file.write ( "FoodItem name: " + name + "\n" );
				file.write ( "FoodItem ID    : " + id + "\n" );
				file.write ( work + amount +"\n" );
				file.write ( "\n" );
				file.close();
			}
			else{
				File newFile = new File("temp.txt");
				FileWriter file=new FileWriter(newFile);
				Scanner scanf=new Scanner(resFile);
				String line;
				while( scanf.hasNextLine() )
				{
					line = scanf.nextLine();
					file.write( line + "\n" );
				}
				file.write ( "FoodItem name: " + name + "\n" );
				file.write ( "FoodItem ID: " + id + "\n" );
				file.write ( work + amount +"\n" );
				file.write ( "\n" );
				
				scanf.close();
				file.close();
				resFile.delete();
				File temp = new File( path + rid +".txt");
				newFile.renameTo(temp);
			}
			
			
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
	
	public static void showDetails ( int rid ){
		try{
			boolean isEmpty = true;
			File resFile = new File ( path + rid + ".txt" );
			if ( resFile.exists() ){
				Scanner scanf = new Scanner ( resFile );
				String line;
				while( scanf.hasNextLine() ){
					line = scanf.nextLine();
					System.out.println ( line );
					isEmpty = false;
				}
				scanf.close();
				if ( isEmpty )
					System.out.println ( "File is Empty" );
			}
			else
				System.out.println ( "File not found" );
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
}


																																//	©	Rashedul_ISLAM