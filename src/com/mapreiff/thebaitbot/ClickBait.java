package com.mapreiff.thebaitbot;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
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
		Calendar cal = Calendar.getInstance();

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
		//people.add("");

		String p1_random = people.get(new Random().nextInt(people.size()));
		String p2_random = people.get(new Random().nextInt(people.size()));
		if (p1_random == p2_random) {
			p1_random = "Famous Person 1";
			p2_random = "Famous Person 2";
			System.out.println(p1_random + " " + p2_random);
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
		// actions.add(" ");
		// actions.add(" ");

		String action = actions.get(new Random().nextInt(actions.size()));
		System.out.println(action);

		// picks type of news
		ArrayList<String> newstype = new ArrayList<String>();
		newstype.add("Breaking News: ");
		newstype.add("Breaking: ");
		newstype.add("Urgent Bulletin: ");
		// newstype.add("SOMETHING: ");

		String bnews = newstype.get(new Random().nextInt(newstype.size()));
		System.out.println(bnews);

		// prints final clickbait title
		System.out.println(bnews + p1_random + action + p2_random + "!");

		try (PrintWriter out = new PrintWriter("Clickbait " + cal.getTimeInMillis() + ".txt")) {

			out.println("Enjoy your clickbait!");
			out.println(bnews + p1_random + action + p2_random + "!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

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


