package addressbook;

import java.util.Scanner;

public class PhoneBookInterface {
	
	public void application() {
		PhoneBookMessage msg = new PhoneBookMessage();
		PhoneBookUtil util = new PhoneBookUtil();
		Scanner sc = new Scanner(System.in);
		while(true) {
			msg.openning();
			switch (sc.nextInt()) {
				case 1:
					msg.c1();
					util.listShow();
					continue;
				case 2:
					msg.c2();
					util.listAdd();
					continue;
				case 3:
					msg.c3();
					util.listDelete(sc.nextLong());
					msg.c30();
					continue;
				case 4:
					msg.c4();
					util.listSearch(sc.next());
					continue;
				case 5:
					msg.endding();
					break;
				default: 
					msg.err();
					continue;
			}	
			sc.close();
			break;
		}	
	}

}
