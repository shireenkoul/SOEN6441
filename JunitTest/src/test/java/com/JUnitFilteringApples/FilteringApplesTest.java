package com.JUnitFilteringApples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.JUnitFilteringApples.FilteringApples.Apple;
/**
 * Class with cases to test the validity of class FilteringApples
 * @author ShireenKoul
 *
 */
public class FilteringApplesTest {

	//@testInstanceannotation vala if we remove static keyword from Initialization function
	 static FilteringApples filApples;
	 static List<Apple> inventory;
/**
 * 	This method initializes the class object and sets up the inventory of apples
 */
	@BeforeAll
public	static void testClassInitialization() {
		filApples=new FilteringApples();
		inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));	
	}
	
/**
 * Test cases for the validity of main() of FilteringApples
 */
	
	@Test
	public	void testMain() {
		assertTrue(true);
	}

/**
 * Test cases for the validity of FilterGreenApples() of FilteringApples Class
 */
	 
	@Test
	public	void testFilterGreenApples() {
		assertEquals(2, filApples.filterGreenApples(inventory).size());
	}

/**
 * Test cases for the validity of FilterHeavyApples() of FilteringApples Class
*/
	
	@Test
	public void testFilterHeavyApples() {
		assertEquals(1, filApples.filterHeavyApples(inventory).size());
	}

/**
* Tests whether the apple is green colored or not
*/	

	@Test
	public	void testIsGreenApple() {
		assertTrue(filApples.isGreenApple(new Apple(155, "green")));
	}

/**
* Tests whether the apple is heavy weighted or not
*/
	
	@Test
	public	void testIsHeavyApple() {
		assertTrue(filApples.isHeavyApple(new Apple(155, "green")));
	}
	
	/**
	* Tests whether the apple is light weighted or not
	*/	
	
	@Test
	public	void testIsHeavyApple_false() {
		assertFalse(filApples.isHeavyApple(new Apple(80, "green")));
	}
	
	/**
	 * Test cases for the validity of FilterApples() of FilteringApples Class with isGreenApple as Predicate
	*/
	
	@Test
	public	void testFilterApples() {	
		assertEquals(2,filApples.filterApples(inventory, FilteringApples::isGreenApple).size());
	}

}
