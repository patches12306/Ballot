package proj0;

import junit.framework.TestCase;

/**
 * class that represents CandidateTest
 * @author Bennguyen
 *
 */

public class CandidateTest extends TestCase{
	private Ballot testBallot;
	private Candidate candTest1;
	private Candidate candTest2;
	private Candidate candTest3;
	
	/**
	 * sets up Candidate test
	 * sets up ballot test
	 * sets up test candidate objects
	 */
	public void setUp() {
		testBallot = new Ballot("test");
		candTest1 = new Candidate("bob", "asd party");
		candTest2 = new Candidate("carl", "kill party");
		candTest3 = new Candidate("john", "will party");

		testBallot.addCandidate(candTest1);
		testBallot.addCandidate(candTest2);
		testBallot.addCandidate(candTest3);
	}
	
	/**
	 * tears down test objects
	 * 
	 */
	public void tearDown(){
		testBallot = null;
		candTest1 = null;
		candTest2 = null;
		candTest3 = null;
	}

	/**
	 * tests getName method
	 * 
	 */
	public void testGetName() {	
		
		assertEquals(candTest1.getName(), "bob");
		assertEquals(candTest2.getName(), "carl");
		assertEquals(candTest3.getName(), "john");
	}
	
	/**
	 * tests getOfficeName method
	 */
	public void testGetOfficeName() {
		assertEquals(candTest1.getAffiliation(), "asd party");
		assertEquals(candTest2.getAffiliation(), "kill party");
		assertEquals(candTest3.getAffiliation(), "will party");
	}
	
	/**
	 * tests getVoteCount method
	 */
	public void testGetVoteCount() {
		assertEquals(candTest1.getVoteCount(),0);
		candTest1.tallyVote();
		assertEquals(candTest1.getVoteCount(),1);
		
		assertEquals(candTest2.getVoteCount(),0);
		candTest2.tallyVote();
		assertEquals(candTest2.getVoteCount(),1);
	}
	
	/**
	 * tests toString method
	 */
	
	public void testToSTring() {
		assertEquals(candTest1.toString(), "bob asd party");
		assertEquals(candTest2.toString(), "carl kill party");
		assertEquals(candTest3.toString(), "john will party");
	}
	
}
