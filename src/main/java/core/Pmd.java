package core;

import java.util.ArrayList;
import java.util.List;

public class Pmd {

	private void switchCasePrimer() {
		int caseIndex = 0;
		switch (caseIndex) {
		case 0:
			System.out.println("Zero");
		case 1:
			System.out.println("One");
		break;
		case 2:
			System.out.println("One");
		break;
		default:
		}
	}
		public static void garbageAllocation() {
			String SB = "";
			for (int i = 0; i < 1000000; i++){
				SB = SB + "Blue Moon";
			}
			System.out.print(SB.substring(0,6));
			
		}
		
		public static void garbageAllocation1() {
			String SB = "";
			for (int i = 0; i < SB.length();i++){
	            if((SB.charAt(i))==(SB.charAt(i+1))){
	    			System.out.println("False");
	            }
	        }
			
		}
		

		
public void Findbugs4(String one) {
	one = new Integer(1).toString();		
	
			  }
		
		public static void NullReferences() {
			String summer = "Great weather";
			String winter = "Snowing";
			try{
				summer.equals(winter);
			}
			catch (NullPointerException e) {
				//
			}
			
		}
		
		public static void NullReferences(Integer count) {
			
			count = 0;
			  synchronized(count) {
			     count++;
			     }
			  }
		
public void Findbugs(String one) {
	one = new Integer(1).toString();		
	
			  }
	
		
		void RawTypes() {
			
			List listOfnumbers = new ArrayList();
			listOfnumbers.add(10);
			listOfnumbers.add("ten");
			listOfnumbers.forEach(n -> System.out.println((int) n * 2));
		}
	
		void RawTypes3() {
			String[] name = new String[3];
			name[0] = "John";
			name[1] = "Vic";
			name[2] = "Max";
			name[3] = "Jessica";
			}
		
		void RawTypes1()  throws RuntimeException{
			    String x = null;
			    if (x != "0");
			    new IllegalArgumentException();
			    // ....
			}
		void RawTypes2() {
			Character so = null;
		try {
			  // Do some work here ...
			  so = new Character(so);
			  so.isLetterOrDigit(so);
			} finally {
			  so.charValue(); // Compiler error here
			}
		}
	
	
	}
	

