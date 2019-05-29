package proj0;
import junit.framework.TestCase;

/**
 * class that represents Ballot Tester
 * @author Bennguyen
 *
 */
public class BallotTester extends TestCase {
	private Ballot testBallot;
	private Candidate candTest1;
	private Candidate candTest2;
	private Candidate candTest3;
	
	
	/**
	 * sets up Ballot Testers
	 * creates test ballot
	 * creates 3 test candidates
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
	 */
	public void tearDown(){
		testBallot = null;
		candTest1 = null;
		candTest2 = null;
		candTest3 = null;
	}
	
	/**
	 * tests getOfficeName
	 * tests ballot class
	 */
	public void testOfficeName() {
		assertEquals(testBallot.getOfficeName(),"test");

	}
	
	/**
	 * tests getCandidates class
	 */
	public void testGetCandidates() {
		assertEquals(testBallot.getCandidates().get(0),candTest1);
		assertEquals(testBallot.getCandidates().get(1),candTest2);
		assertEquals(testBallot.getCandidates().get(2),candTest3);
	}
	
}
