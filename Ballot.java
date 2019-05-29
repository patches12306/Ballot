package proj0;
 

import java.util.ArrayList;

/**
 * 
 * @author Ben nguyen
 * class that represents a ballot
 */
public class Ballot
{
	/**
	 * initializes an arraylist, ballot
	 */
	ArrayList <Candidate> ballot = new ArrayList <Candidate>();

	public String OffName;
	
 /**
  * 
  * @param officeName, name of office
  */
	public Ballot(String officeName)
	{
		OffName = officeName;
	}
	/**
	 * 
	 * @return name of office
	 */
	public String getOfficeName()
	{
		return OffName;
	}
	
	/**
	 * add candidate to arraylist
	 * @param c , candidate
	 * if candidate already exists, candidate just added is removed
	 */
	public void addCandidate(Candidate c)
	
	{
		ballot.add(c);	
		
		for (int i = 0; i < ballot.size(); i++) {
			if (c.Compare(ballot.get(i)) == true) {
				ballot.remove(c);
			}
			else {ballot.remove(null);
			}
		}
	
	}
	/**
	 * 
	 * @return array of candidates
	 */
	public ArrayList<Candidate> getCandidates()
	{
		return ballot;
		 
	}
	
	/**
	 * creates test candidate that has vote count of zero
	 * iterates through candidates and if candidate(i)'s vote count is greater than TestCand, that candidate becomes the new candidate
	 * @return winning candidate
	 */
	public Candidate getWinningCandidate()
	{
		 Candidate TestCand = new Candidate("test","test");
		 for (int i = 0; i < ballot.size(); i++) {
			 if (ballot.get(i).getVoteCount() > TestCand.getVoteCount()) {
				 TestCand = ballot.get(i);
			 }
		 }
		 return TestCand;
		 
	}
	
}
