package hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class SimpleArraySumResult {

	public static int simpleArraySum(List<Integer> ar) {
		// Write your code here

		int arrSum = 0;
		for (int i = 0; i < ar.size(); i++) {
			arrSum += ar.get(i);
		}

		return arrSum;
	}

}

public class SimpleArraySum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//				.map(Integer::parseInt).collect(toList());
//
//		int result = Result.simpleArraySum(ar);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(10);
		ar.add(11);

		System.out.println(SimpleArraySumResult.simpleArraySum(ar));
	}

}
