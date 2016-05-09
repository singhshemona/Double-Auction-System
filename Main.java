import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public class Main{
	
public static void main(String args[]) {
	
	//setting up variables
	List<String> trading = new ArrayList<String>();
	
	ArrayList<String> sell = new ArrayList<String>();
	ArrayList<String> buy = new ArrayList<String>();
	
	int cost = 0;
	int exchange = 0;
	
	//setting up user+computer communications
	Scanner kbd = new Scanner(System.in);
	int i = 0;
	
	while (kbd.hasNextLine()) {
		trading.add(kbd.nextLine());}
		 
	for (String Trading: trading) {	
		System.out.println("" + trading.get(i));

		if (trading.get(i).contains("sell")) {
			sell.add(trading.get(i));
		}
	
		if (trading.get(i).contains("buy")) {
			buy.add(trading.get(i));
	    }
	}
	
	//completing the double auction system
	int tobuy = 0;
	int tosell = 0;
		 
	for (int getTrade: buy) {
		tobuy = getCost(buy.get(i));
		
	for (int j = 0; j < sell.size(); j++) {
	    tosell = getCost(sell.get(j));
	
	    if (buy == sell) {
	    	cost += 2 * tobuy;
		    exchange += 2;
	    }
	}
	}
	//setting up user input of numbers
	int buyorsell;
	int shares;
	
	Scanner input1=new Scanner(System.in);
	Scanner input2=new Scanner(System.in);
	
	System.out.println(input1.nextLine()+input2.nextLine());
	
	System.out.println("shares exchanged " + exchange + " total value "+ cost);

	
	  }

private static int getCost(String string) {
	// TODO Auto-generated method stub
	return getCost(0);
}}
