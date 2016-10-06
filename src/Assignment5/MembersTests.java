import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MembersTests {

	Members members;
	Members1 members1;
	Members2 members2;

	@Before
	public void setUpMembers() {
		members = new Members();
		members1 = new Members1();
		members2 = new Members2();
	}
	//This test should fail, please delete this comment after you edit code Alex or Daniel
	@Test
	public void testMembersBreaksRepInv() {
		members.join("Paul");
		members.join("Paul");
		assertEquals(true, members.repOk2());
	}
	
	//This test should fail, please delete this comment after you edit code Alex or Daniel
	@Test
	public void testMembersSatisfiesRepInvButBreaksContract() {
		members.join("Paul");
		members.join("Paul");
		members.leave("Paul");
		assertEquals(false, members.isMember("Paul"));
	}

	@Test
	public void testMembers1KeepsRepInv() {
		assertEquals(true, members1.repOk1());
		members1.join("Daniel");
		assertEquals(true, members1.repOk1());
		members1.leave("Daniel");
		assertEquals(true, members1.repOk1());
	}

	@Test
	public void testMembers1KeepsContractAndRepInv() {
		members1.join("Daniel");
		members1.join("Daniel");
		members.leave("Daniel");
		assertEquals(false, members.isMember("Daniel"));
	}

	@Test
	public void testMembers2KeepsRepInv() {
		members2.join("Alex");
		members2.join("Alex");
		assertEquals(true, members2.repOk2());
	}

	@Test
	public void testMembers2KeepsContractAndRepInv() {
		members2.join("Alex");
		assertEquals(true, members2.isMember("Alex"));
		members2.join("Alex");
		members2.leave("Alex");
		assertEquals(false, members2.isMember("Alex"));
	}
}

