package hackerRank;

public class Test4 {
	/*
	 배달이가 좋아하는 369게임(배달이는 아재입니다.)을 하고자 합니다. 
	놀이법은 1부터 숫자를 하나씩 대면서, 3, 6, 9가 들어가는 숫자는 숫자를 말하는 대신 3, 6, 9의 개수만큼 
	손뼉을 쳐야 합니다.
	
	숫자 number가 매개변수로 주어질 때, 1부터 number까지 손뼉을 몇 번 쳐야 하는지 횟수를 return 하도록 
	solution 메서드를 완성해주세요.
	
	제한사항
	number는 1 이상 10,000 이하인 자연수입니다.
	입출력 예
	number	result
	13	4
	33	14
	입출력 예 설명
	입출력 예 #1
	1부터 13까지 총 4번의 손뼉을 쳐야 합니다.
	
	3	6	9	13
	짝	짝	짝	짝
	입출력 예 #2
	1부터 33까지 총 14번의 손뼉을 쳐야 합니다.
	
	3	6	9	13	16	19	23	26	29	30	31	32	33
	짝	짝	짝	짝	짝	짝	짝	짝	짝	짝	짝	짝	짝짝
	 */
	public static void main(String[] args) {
		int number=33;
		System.out.println(solution(number));
	}
	
	public static int solution(int number) {
		int sum=0;
		
		for(int i=1; i<=number; i++) {
			String str = String.valueOf(i);
			for (int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9') {
					System.out.println(str.charAt(j));
					sum++;
				}
			}
		}

		return sum;
	}

}
