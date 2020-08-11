package cocomanmo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class cocomanmo3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 1;
		solution(a, b);
	}
	
	/*
	 *
	문제 : 2016년
	-
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
	 * 
	 */

	public static String solution(int a, int b) {
		String answer = "";
		String[] day = {"FRI","SAT","SUN","MON","TUE","WED", "THU"}; 
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int nDay=0;
		 for(int i=0; i<a-1; i++) 
		 { 
			 nDay+=date[i];

		 }
		 nDay+= b-1;
		 answer=day[nDay%7];
	
		 
		/*
		Calendar calendar = Calendar.getInstance();
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.MONTH, a - 1);
		calendar.set(Calendar.DAY_OF_MONTH, b);

		//calendar.set(2016, a-1 , b);

		answer = day[calendar.get(Calendar.DAY_OF_WEEK) - 1];

		System.out.println(a);
		System.out.println(answer);
		*/
		return answer;

	}
}
