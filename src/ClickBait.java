
import java.util.Random;

public class ClickBait {
	
	public static void main (String args[]){
		
		

		//@SuppressWarnings("unused")
		//public void getRandomString() {
			Random r = new Random();

			int i = r.nextInt() % 3;
			String per1 = "Obama";
			String per2 = "Donald Trump";
			String per3 = "Bernie Sanders"; 
			String per4 = "Hillary Clinton"; 
			String per5 = "Madonna"; 
			String per6 = "Tim Cook"; 
			String per7 = "Sergey Brin"; 
			String per8 = "Larry Page"; 
			String per9 = "Edward Snowden"; 
			//String per10 = ""; 
			//String ppl1;
			//String ppl2;
			String p1 = null;
		//	String p2 = null;
			/*
			 String do1 = ; String do2 = ; String do3 = ; String do4 = ; String do5 = ;
			 String do6 = ; String do7 = ; String do8 = ; String do9 = ; String do10 = ;
			 String do11 = ; String do12 = ; String do13 = ; String do14 = ; String do15 =
			 ; String do16 = ;
			 */
			switch (i) {
			case 0:
				p1 = per1;
			case 1:
				p1 = per2;
			case 2:
				p1 = per3;
			case 3:
				p1 = per4;
			case 4:
				p1 = per5;
			case 5:
				p1 = per6;
			case 6:
				p1 = per7;
			case 7:
				p1 = per8;
			case 8:
				p1 = per9;
	/*		case 9:
				p1 = per10;
			case 10:
				String ppl1 = per11;
			case 11:
				String ppl1 = per12;
			case 12:
				String ppl1 = per13;
			case 13:
				String ppl1 = per14;
			case 14:
				String ppl1 = per15;
			case 15:
				String ppl1 = per16;*/	
			default:
				break;
			}
			
			System.out.println(p1);
			
		}

		
	}
	

