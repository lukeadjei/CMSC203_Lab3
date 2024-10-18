import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gb = new GradeBook(5);
	GradeBook gb2 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		gb.addScore(80);
		gb.addScore(95);
		
		gb2.addScore(60);
		gb2.addScore(75);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb=gb2=null;
	}
	

	@Test
	void addScore() {
		assertTrue(gb.toString().equals("80.0 95.0 0.0 0.0 0.0 "));
		assertTrue(gb2.toString().equals("60.0 75.0 0.0 0.0 0.0 "));
		
		assertEquals(gb.getScoreSize(), 2);
		assertEquals(gb2.getScoreSize(), 2);
	}
	
	@Test
	void sum() {
		assertEquals(gb.sum(), 80.0+95.0);
		assertEquals(gb2.sum(), 60.0+75.0);
	}
	
	@Test
	void minimum() {
		assertEquals(gb.minimum(), 80.0);
		assertEquals(gb2.minimum(), 60.0);
	}
	
	@Test
	void finalScore() {
		assertEquals(gb.finalScore(), 175.0-80.0);
		assertEquals(gb2.finalScore(), 135.0-60.0);
		
	}

}
