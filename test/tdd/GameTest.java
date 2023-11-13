package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void testAucuneQuille() {
		assertEquals(game.score(), 0);
	}
	
	@Test
	void testAucuneQuille20Fois() {
		for (int i = 0; i<20; i++) {game.roll(0);}
		assertEquals(game.score(), 0);
	}
	
	@Test
	void test1Quille20Fois() {
		for (int i = 0; i < 20; i++) {game.roll(1);}
		assertEquals(game.score(), 20);
	}
	
	@Test
	void test1Quille10Fois2Quilles10Fois () {
		for (int i = 0; i < 10; i++) {game.roll(1);}
		for (int i  = 0; i < 10; i++) {game.roll(2);}
		assertEquals(game.score(), 30);
	}

}
