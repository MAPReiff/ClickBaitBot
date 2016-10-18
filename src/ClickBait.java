
import java.util.Random;

public class ClickBait {

	public static void main(String args[]) {

		// declaring main variables
		String p1 = null;
		String p2 = null;
		String action = null;
		String bnews = null;
		Random rand = new Random();
		Calendar cal = Calendar.getInstance();
		
		// People
		String per1 = "Obama";
		String per2 = "Donald Trump";
		String per3 = "Bernie Sanders";
		String per4 = "Hillary Clintion";
		String per5 = "Madonna";
		String per6 = "Tim Cook";
		String per7 = "Sergey Brin";
		String per8 = "Larry Page";
		String per9 = "Edward Snowden";
		String per10 = "Ozzy Osbourne";

		int pe1 = rand.nextInt(10);
		int pe2 = rand.nextInt(8);
		switch (pe1) {
		case 0:
			p1 = per1;
			switch (pe2) {
			case 0:
				p2 = per2;
				break;
			case 1:
				p2 = per3;
				break;
			case 2:
				p2 = per4;
				break;
			case 3:
				p2 = per5;
				break;
			case 4:
				p2 = per6;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			case 8:
				p2 = per10;
				break;
			}
			break;
		case 1:
			p1 = per2;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per3;
				break;
			case 2:
				p2 = per4;
				break;
			case 3:
				p2 = per5;
				break;
			case 4:
				p2 = per6;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 2:
			p1 = per3;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per4;
				break;
			case 3:
				p2 = per5;
				break;
			case 4:
				p2 = per6;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 3:
			p1 = per4;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per5;
				break;
			case 4:
				p2 = per6;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 4:
			p1 = per5;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per6;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 5:
			p1 = per6;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per5;
				break;
			case 5:
				p2 = per7;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 6:
			p1 = per7;
			switch (pe2) {
			case 0:
				p2 = per1;
				break;
			case 8:
				p2 = per10;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per5;
				break;
			case 5:
				p2 = per6;
				break;
			case 6:
				p2 = per8;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 7:
			p1 = per8;
			switch (pe2) {
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per5;
				break;
			case 5:
				p2 = per6;
				break;
			case 6:
				p2 = per7;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		case 8:
			p1 = per9;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per5;
				break;
			case 5:
				p2 = per6;
				break;
			case 6:
				p2 = per7;
				break;
			case 7:
				p2 = per8;
				break;
			}
			break;
		case 9:
			p1 = per10;
			switch (pe2) {
			case 8:
				p2 = per10;
				break;
			case 0:
				p2 = per1;
				break;
			case 1:
				p2 = per2;
				break;
			case 2:
				p2 = per3;
				break;
			case 3:
				p2 = per4;
				break;
			case 4:
				p2 = per5;
				break;
			case 5:
				p2 = per6;
				break;
			case 6:
				p2 = per7;
				break;
			case 7:
				p2 = per9;
				break;
			}
			break;
		}

		System.out.println(p1);

		System.out.println(p2);

		// actions
		String act1 = " wants to sue ";
		String act2 = " is going to talk to ";
		String act3 = " is mad at ";
		String act4 = " is angry at ";
		String act5 = " wants to hire ";
		String act6 = " wants to kill ";
		String act7 = " wants to marry ";

		// picks action
		int act = rand.nextInt(7);
		switch (act) {
		case 0:
			action = act1;
			break;
		case 1:
			action = act2;
			break;
		case 2:
			action = act3;
			break;
		case 3:
			action = act4;
			break;
		case 4:
			action = act5;
			break;
		case 5:
			action = act6;
			break;
		case 6:
			action = act7;
			break;
		}

		System.out.println(action);

		// picks type of news
		int type = rand.nextInt(3);
		switch (type) {
		case 0:
			bnews = "Breaking News: ";
			break;
		case 1:
			bnews = "Breaking: ";
			break;
		case 2:
			bnews = "Urgent Bulletin: ";
			break;
		}

		System.out.println(bnews);

		// prints final clickbait title
		System.out.println(bnews + p1 + action + p2 + "!");
		
		try (PrintWriter out = new PrintWriter("Clickbait " + cal.getTimeInMillis() + ".txt")) {

			out.println("Enjoy your clickbait!");
			out.println(bnews + p1 + action + p2 + "!");

		}
		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			//Tweet Text here!
			twitter.updateStatus(bnews + p1 + action + p2 + "! #TheBaitBot");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
		
	}

}
