package hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




class DiagonalDifferenceResult {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
	
	
	

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here

    	int cnt=arr.size()-1; // ������>���� ���� ���ϱ� ����
    	
    	int diagonalL = 0; // ����>������ �밢�� ��
    	int diagonalR = 0; // ������>���� �밢�� ��
    	
    	
    	for(int i=0; i<arr.size(); i++) {
    		diagonalL += arr.get(i).get(i);
    		diagonalR += arr.get(i).get(cnt);
    		cnt--;

    	}

    	return Math.abs(diagonalL-diagonalR); // ���밪
    }

}


public class DiagonalDifference {

	public static void main(String[] args) throws IOException {
		
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		
		List<Integer> arrList1 = new ArrayList<Integer>();
		List<Integer> arrList2 = new ArrayList<Integer>();
		List<Integer> arrList3 = new ArrayList<Integer>();
		
		arrList1.add(11);
		arrList1.add(2);
		arrList1.add(4);
		
		arrList2.add(4);
		arrList2.add(5);
		arrList2.add(6);
		
		arrList3.add(10);
		arrList3.add(8);
		arrList3.add(-12);
		
		
		arr.add(arrList1);
		arr.add(arrList2);
		arr.add(arrList3);
	
        
        System.out.println(DiagonalDifferenceResult.diagonalDifference(arr));
	}

}
