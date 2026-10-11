package PracaticeOOPS_Programs;


import java.io.*;
public class IOStream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Users/polur/Desktop/Java/Eclipse/OOPS/src/PracaticeOOPS_Programs/IOStream.java");
		FileWriter fw = new FileWriter("C:/Users/polur/Desktop/Java/Java_Programs/Sample.txt");
		int c;
		int count = 0;
		int lines = 0;
		int character = 0;
		while((c = fr.read())!= -1){
			fw.write(c);
			System.out.print((char)c);
			if(c == '\n') {
				lines++;
			}
			if(c == ' ') {
				count++;
			}
			character++;
			
			
		}
		System.out.println("lines: " + lines);
		System.out.println("Words: "+ (count+lines));
		System.out.println("Character: "+character);
		fr.close();
		fw.close();
		
	}

}
