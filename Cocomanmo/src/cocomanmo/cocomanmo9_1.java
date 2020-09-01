package cocomanmo;

import java.util.ArrayList;

public class cocomanmo9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone_number= "01033334444";
		solution(phone_number);
	}
	
	/*
	 문제 : 핸드폰 번호 가리기
	 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	제한 조건
	s는 길이 4 이상, 20이하인 문자열입니다.
	 */

	public static String solution(String phone_number) {
        String answer = "";
        
        int size = phone_number.length();
        int cnt=0;        
        ArrayList<String> ex = new ArrayList<>();
        
        for(String str : phone_number.split("")) {
        	if(ex.size() < size-4 ? ex.add("*") : ex.add(str)); 
        	answer+=ex.get(cnt++);
        }
     
        return answer;
    }
}
