package proj0;


/**
  * class that represents candidate
  * @author Ben nguyen
  *
  */
public class Candidate

{
	public String n;
	public String aff;
	public int vote;
	 
	/**
	 * creates candidate
	 * @param name name of candidate
	 * @param affiliation name of affiliation
	 */
	public Candidate(String name, String affiliation)
	{
	this.n = name;
	this.aff = affiliation;
	}

   /**
    * 
    * @return n name 
    */
	public String getName()
	{
	 return n;
	}
	
	 /**
	  * 
	  * @return aff affiliation
	  */
	public String getAffiliation()
	{
	 return aff;	 
	}

	/**
	 * 
	 * @return vote number of votes
	 */
	public int getVoteCount()
	{
	 return vote;	
	}
	
	/**
	 * compares the string values of two candidates
	 * @param cand candidate
	 * @return true if the two candidates have the same string values
	 */
	public boolean Compare(Object cand) {
		if (cand instanceof Candidate) {  //1
			Candidate cand1 = (Candidate) cand;
			if (this.toString() == cand1.toString()) {//2
				return true;

			}
			else {
				return false;
			}
		}
		else {
            return false;  			
		} 
	}

	/**
	 *  increments vote by one when called
	 */
	public void tallyVote()
	{
		vote += 1;
	}
	
	/**
	 *  @return string of name
	 */
	public String toString()
	{
		return this.getName() + " " + this.getAffiliation() ;
	}
}
