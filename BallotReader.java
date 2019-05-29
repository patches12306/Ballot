package proj0;
 
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Bennguyen
 *class that represents BallotReader
 */
public class BallotReader
{
	static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> affil = new ArrayList<>();

    /**
     * reads ballot text file
     * @param filename
     * @return ballot
     * @throws IOException
     */
    public static Ballot readBallot(String filename) throws IOException
	{
		
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            Ballot myBal = null;
            
            while (sc.hasNext()) {
    			String office = sc.nextLine();
    			myBal = new Ballot(office);
    			int numCandidates = Integer.parseInt(sc.nextLine());
    			
    			for (int i = 0; i < numCandidates; i++) {

    			String[] ar = sc.nextLine().split(";");
    			Candidate tempCand = new Candidate(ar[0], ar[1]);
				myBal.addCandidate(tempCand);
			}
		}
		sc.close();
		
		return myBal;
		
	}

		
}



 