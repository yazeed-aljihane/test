import java.util.Scanner;
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pruodct[]= {"iphon=3000","ipad=1000","laptop=4000","screen=5600","ps5=1800"};
 		for (int i =0;i<pruodct.length;i++)
 			System.out.println("prudact number" +i+":" + pruodct[i]);
		Scanner r = new Scanner (System.in);
		System.out.println("enter the prodact and the price: ");
		String real = r.next();
		int d = real.indexOf("=");
		if (d==-1)
			System.out.println("error");
		else {
			double $ = 3.80;
			double yoro = 4.47;
			int number = Integer.parseInt(real.substring(d+1));
			System.out.println("the prices is :"+ number*yoro+" Euro " + " or "+ number*$+" Dollar " );
			r.close();
			
	}	
	}

}
