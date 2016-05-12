
import java.util.Random;

public class ClickBait {

	public static void main(String args[]) {

		String per1 = "Obama";
		String per2 = "Donald Trump";
		String per3 = "Bernie Sanders";
		String per4 = "Hillary Clinton";
		String per5 = "Madonna";
		String per6 = "Tim Cook";
		String per7 = "Sergey Brin";
		String per8 = "Larry Page";
		String per9 = "Edward Snowden";

		String p1 = null;
		String p2 = null;

		Random rand = new Random();
		int rr = rand.nextInt() % 9;

		switch (rr) {
		case 0:
			p1 = per1;
			break;
		case 1:
			p1 = per2;
			break;
		case 2:
			p1 = per3;
			break;
		case 3:
			p1 = per4;
			break;
		case 4:
			p1 = per5;
			break;
		case 5:
			p1 = per6;
			break;
		case 6:
			p1 = per7;
			break;
		case 7:
			p1 = per8;
			break;
		case 8:
			p1 = per9;
			break;
		}

		System.out.println(p1);

	}

}
