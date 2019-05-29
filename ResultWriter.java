package proj0;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ResultWriter
{
	
	public static void writeResults(String filename, Ballot ballot)
	throws IOException
	{
		
	String firstLine = "RESULTS - " + ballot.OffName;
	String secondLine = "";
	String lastLine = "";

	
	for (int i = 0; i < firstLine.length(); i++) {
		secondLine += "-";
	}
	try {
	FileWriter myFile = new FileWriter(filename);
	PrintWriter myPrint = new PrintWriter(myFile);
	
	myPrint.println(firstLine);
	myPrint.println(secondLine);

	for (int i = 0; i < ballot.ballot.size(); i++) {
		Candidate tempCand = ballot.ballot.get(i);
		myPrint.printf("%-20s %4s %n", tempCand.toString(), String.valueOf(tempCand.getVoteCount()));
		}
	
	lastLine = "WINNER: " + ballot.getWinningCandidate().toString();
	
		myPrint.println("");
		myPrint.println(lastLine);

		myPrint.close();	
	}
	catch (IOException e) {
		System.out.println("Error");
	}
	}
	
}
