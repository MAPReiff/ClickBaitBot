//		Version 1.3.1
//		11/10/16
//		Made by Mitchell Reiff and intended for use with @TheClickbaitBot on twitter.
//		http://mreiff.space/projects/clickbaitbot for more details.

package com.mapreiff.thebaitbot;

import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class ClickBait extends TimerTask {

	static String consumerKeyStr = "X";
	static String consumerSecretStr = "X";
	static String accessTokenStr = "X";
	static String accessTokenSecretStr = "X";

	public static void main(String args[]) throws FileNotFoundException {

		Timer timer = new Timer();
		timer.schedule(new ClickBait(), 0, 600000);
	}

	@Override
	public void run() {
		// System.out.println("Test");
		// Calendar cal = Calendar.getInstance();

		Random rand = new Random();

		int type = rand.nextInt(2) + 1;

		if (type == 2 /* top X list */ ) {

			ArrayList<String> kind = new ArrayList<String>();
			kind.add("Top ");
			kind.add("The best ");
			kind.add("The worst ");
			kind.add("Strangest ");
			kind.add("Strongest ");
			kind.add("Weakest ");
			kind.add("");
			kind.add("Documentary: ");
			kind.add("The Top ");

			ArrayList<String> number = new ArrayList<String>();
			number.add("Five");
			number.add("Six");
			number.add("Seven");
			number.add("Eight");
			number.add("Nine");
			number.add("Ten");
			number.add("Fifteen");
			number.add("100");
			number.add("Fifty");
			

			ArrayList<String> thing = new ArrayList<String>();
			thing.add(" Cats");
			thing.add(" Dogs");
			thing.add(" Countries");
			thing.add(" Foods");
			thing.add(" Children");
			thing.add(" Adults");
			thing.add(" Videos");
			thing.add(" Cars");
			thing.add(" Lies");
			thing.add(" Murders");
			thing.add(" Convicts");
			thing.add(" Criminals");
			thing.add(" Smart People");
			thing.add(" Really Stupid People");
			thing.add(" World Leaders");
			thing.add(" Billionares");
			thing.add(" Millionares");
			

			ArrayList<String> ofWhat = new ArrayList<String>();
			ofWhat.add(" in the world");
			ofWhat.add(" of all time");
			ofWhat.add(" in the USA");
			ofWhat.add(" in America");
			ofWhat.add(" of the past year");
			ofWhat.add(" that ever existed");
			ofWhat.add(" in Mexico");
			ofWhat.add(" in Europe");
			ofWhat.add(" in Asia");
			ofWhat.add(" in Canada");
			ofWhat.add(" on the internet");
			ofWhat.add(" in the word");
			ofWhat.add(" of 2016");
			ofWhat.add(" of 2015");
			ofWhat.add(" in Russia");
			ofWhat.add(" in China");
			ofWhat.add(" in Japan");
			ofWhat.add(" in England");
			ofWhat.add(" in Germany");
			ofWhat.add(" in Africa");
			ofWhat.add(" in the Middle East");
			ofWhat.add(" in Australia");

			String what = ofWhat.get(new Random().nextInt(ofWhat.size()));
			String subject = thing.get(new Random().nextInt(thing.size()));
			String num = number.get(new Random().nextInt(number.size()));
			String starter = kind.get(new Random().nextInt(kind.size()));

			System.out.println(starter + num + subject + what);

			try {
				Twitter twitter = new TwitterFactory().getInstance();

				twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
				AccessToken accessToken = new AccessToken(accessTokenStr, accessTokenSecretStr);

				twitter.setOAuthAccessToken(accessToken);

				// Tweet Text here!
				twitter.updateStatus(starter + num + subject + what + "! #TheBaitBot");

				System.out.println("Successfully sent a tweet!");
				System.out.println("Tweet said " + starter + num + subject + what + "! #TheBaitBot");
			} catch (TwitterException te) {
				te.printStackTrace();
			}

		} else {

			ArrayList<String> people = new ArrayList<String>();
			people.add("Obama");
			people.add("Donald Trump");
			people.add("Bernie Sanders");
			people.add("Hillary Clintion");
			people.add("Bill Clintion");
			people.add("Modanna");
			people.add("Tim Cook");
			people.add("Sergey Brin");
			people.add("Larry Page");
			people.add("Edward Snowden");
			people.add("Ozzy Osbourne");
			people.add("Johnny Depp");
			people.add("Arnold Schwarzenegger");
			people.add("Morgan Freeman");
			people.add("Will Smith");
			people.add("George Clooney");
			people.add("Keem Star");
			people.add("Oprah");
			people.add("Kim Kardashian");
			people.add("Beyoncé");
			people.add("Angelina Jolie");
			people.add("Brad Pitt");
			people.add("Steven Spielberg");
			people.add("Tom Cruise");
			people.add("Selena Gomez");
			people.add("Justin Bieber");
			people.add("Michael Jordan");
			people.add("Jim Carrey");
			people.add("Dre");
			people.add("Ariana Grande");
			people.add("Taylor Swift");
			people.add("Snoop Dog");
			people.add("Jay Z");
			people.add("Tiger Woods");
			people.add("Whoopi Goldberg");
			people.add("Al Gore");
			people.add("Ellen");
			people.add("Jill Stein");
			people.add("Gary Johnson");
			people.add("Malik Obama");
			people.add("Mike Pence");
			people.add("Tim Kaine");
			// people.add("");

			String p1_random = people.get(new Random().nextInt(people.size()));
			String p2_random = people.get(new Random().nextInt(people.size()));
			if (p1_random == p2_random) {
				p1_random = people.get(new Random().nextInt(people.size()));
				p2_random = people.get(new Random().nextInt(people.size()));
				System.out.println(p1_random + " " + p2_random);
				if (p1_random == p2_random) {
					p1_random = people.get(new Random().nextInt(people.size()));
					p2_random = people.get(new Random().nextInt(people.size()));
					System.out.println(p1_random + " " + p2_random);
				}
			} else {
				System.out.println(p1_random + " " + p2_random);
			}

			System.out.println(p1_random);
			System.out.println(p2_random);

			ArrayList<String> actions = new ArrayList<String>();
			actions.add(" wants to sue ");
			actions.add(" is going to fight with ");
			actions.add(" is mad at ");
			actions.add(" is angry at ");
			actions.add(" wants to hire ");
			actions.add(" wants to kill ");
			actions.add(" wants to marry ");
			actions.add(" was killed by ");
			actions.add(" was raped by ");
			actions.add(" wants to hack ");
			actions.add(" was hacked by ");
			actions.add(" was attacked by ");
			actions.add(" wants to murder ");
			actions.add(" is amazed by ");
			// actions.add(" ");
			// actions.add(" ");

			String action = actions.get(new Random().nextInt(actions.size()));
			System.out.println(action);

			// picks type of news
			ArrayList<String> newstype = new ArrayList<String>();
			newstype.add("Breaking News: ");
			newstype.add("Breaking: ");
			newstype.add("Urgent Bulletin: ");
			newstype.add("Drama: ");
			// newstype.add("SOMETHING: ");

			String bnews = newstype.get(new Random().nextInt(newstype.size()));
			System.out.println(bnews);

			// prints final clickbait title
			System.out.println(bnews + p1_random + action + p2_random + "!");

			/*
			 * try (PrintWriter out = new PrintWriter("Clickbait " +
			 * cal.getTimeInMillis() + ".txt")) {
			 * 
			 * out.println("Enjoy your clickbait!"); out.println(bnews +
			 * p1_random + action + p2_random + "!");
			 * 
			 * } catch (FileNotFoundException e) { e.printStackTrace(); }
			 */

			try {
				Twitter twitter = new TwitterFactory().getInstance();

				twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
				AccessToken accessToken = new AccessToken(accessTokenStr, accessTokenSecretStr);

				twitter.setOAuthAccessToken(accessToken);

				// Tweet Text here!
				twitter.updateStatus(bnews + p1_random + action + p2_random + "! #TheBaitBot");

				System.out.println("Successfully sent a tweet!");
				System.out.println("Tweet said " + bnews + p1_random + action + p2_random + "! #TheBaitBot");
			} catch (TwitterException te) {
				te.printStackTrace();
			}

		}
	}

}
