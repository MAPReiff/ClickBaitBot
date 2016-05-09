package com.comixsyt.clickbaitbot;

import java.util.Random;

public class ClickBait {

	Random r = new Random();
	int i = r.nextInt() % 3;

	public String getRandomString() {
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
/*		String per10 = ; 
		String per11 = ; 
		String per12 = ; 
		String per13 = ; 
		String per14 = ; 
		String per15 = ; 
		String per16 = ;*/
		
		String ppl1;
		String ppl2;
		String doing;
		String act;
		
		/*
		 String do1 = ; String do2 = ; String do3 = ; String do4 = ; String do5 = ;
		 String do6 = ; String do7 = ; String do8 = ; String do9 = ; String do10 = ;
		 String do11 = ; String do12 = ; String do13 = ; String do14 = ; String do15 =
		 ; String do16 = ;
		 */
		switch (i) {
		case 0:
			String ppl1 = per1;
		case 1:
			String ppl = per2;
		case 2:
			String ppl = per3;
		case 3:
			String ppl = per4;
		case 4:
			String ppl = per5;
		case 5:
			String ppl = per6;
		case 6:
			String ppl = per7;
		case 7:
			String ppl = per8;
		case 8:
			String ppl = per9;
		case 9:
/*			String ppl = per10;
		case 10:
			String ppl = per11;
		case 11:
			String ppl = per12;
		case 12:
			String ppl = per13;
		case 13:
			String ppl = per14;
		case 14:
			String ppl = per15;
		case 15:
			String ppl = per16;*/	
		default:
			break;
		}

	}

}
