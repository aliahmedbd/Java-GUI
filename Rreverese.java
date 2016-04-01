import java.io.*;
import java.util.*;
class Reverse{
	public static void main(String ... S) throws IOException
	{
		int wordCounter=0; 
		int i;
		ArrayList<Character> reverse=new ArrayList<Character>();
		FileOutputStream fos=new FileOutputStream(new File("reverse.txt"));
		FileReader fr =new FileReader(new File("file.txt"));
		while((i=fr.read())!=-1){
			reverse.add((char)i);		
		}
		for(int j=reverse.size()-1;j>=0;j--){
			fos.write(reverse.get(j));
			System.out.print(reverse.get(j));
		}	
		fos.close();
	}
}
