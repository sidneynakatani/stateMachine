package br.com.sidney;

import java.util.Scanner;

public class TrafficLightDemo {
	
	private static final String GREEN  = "1";
	private static final String YELLOW = "2";
	private static final String RED    = "3";
	
public static void main(String[] args){
	
		TrafficLightControl trafficLightControl = new TrafficLightControl();
			
		while(true){
			
			Scanner scan = new Scanner(System.in);
	        System.out.print("States: 1 - Green / 2 - Yellow / 3 - Red --> Choose state:");
	        String state = scan.next();
	        
	        switch(state){
	        	
	        	case(GREEN):
	        		trafficLightControl.setSemaphoreState(new GreenLight());
	        		break;
	        	
	        	case(YELLOW):
	        		trafficLightControl.setSemaphoreState(new YellowLight());
	        		break;
	        	
	        	case(RED):
	        		trafficLightControl.setSemaphoreState(new RedLight());
	        		break;
	        	
	        	default:
	        		System.exit(0);
	        		
	        }
	        
	        Semaphore semaphoreState = trafficLightControl.getSemaphoreState();
	        semaphoreState.doAction();
	        
		}
		
	}

}
