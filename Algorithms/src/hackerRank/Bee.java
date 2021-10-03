package hackerRank;

import java.awt.image.AbstractMultiResolutionImage;

public class Bee {
	// 백준문제) 2292번: 벌집
	/*
	위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
	숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
	예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
	입력
	첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
	
	출력
	입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
	
	예제 입력 1     답
	13			> 3

	 */
	
	public static int solution(int num) {
		int result=1;
		//중간 1이 기준임.
		// 6(n-1) .. 6씩 증가!
		// 1개 : ~1
		// 2개 : 2~7 //~1+6 
		// 3개 : 8~19 // 1+18
		
		int val=1;
		
		while(true) {
			if(num>val) {
				result++;
				val+=6*(result-1);
			} else {
				break;
			}

		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int num=53;
		System.out.println(solution(num));
	}

}
