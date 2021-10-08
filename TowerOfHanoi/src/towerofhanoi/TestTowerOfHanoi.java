package towerofhanoi;

import static org.junit.jupiter.api.Assertions.*;
import static towerofhanoi.TowerOfHanoi.solve;

import org.junit.jupiter.api.Test;

class TestTowerOfHanoi {

	@Test
	void solveOne() {
		assertEquals("A to C", solve(1));
	}
	
	@Test
	void solveTwo() {
		assertEquals("A to B, A to C, B to C", solve(2));
	}
	
	@Test
	void solveThree() {
		assertEquals("A to C, A to B, C to B, A to C, B to A, B to C, A to C", solve(3));
	}

}
