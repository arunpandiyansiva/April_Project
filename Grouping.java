package com;

import org.junit.jupiter.params.ParameterizedTest;
import org.testng.annotations.Test;

public class Grouping {
	//groups
	 
	//scenario--->bikes--->yamaha,suzuki,ktm
	@Test (groups = "Yamaha") 
	private void Yamaha() {
    System.out.println("FZ-V3");
	}
    @Test(groups = "Yamaha")
    private void Yamaha1() {
    System.out.println("Fascino");
	}	
	@Test(groups = "suzuki")
    private void Suzuki() {
    System.out.println("Gixxer");
	}
    @Test(groups = "Suzuki")
    private void Suzuki1() {
    System.out.println("Access 125");
	}
    @Test(groups = "ktm")
    private void Ktm() {
    System.out.println("duke 125");
	}
    @Test(groups = "ktm")
    private void Ktm1() {
    System.out.println("Duke 250");
	}
    
	@Test(groups = "Suzuki")
	private void Suzuki2() {
		System.out.println("Gixxer250");
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
