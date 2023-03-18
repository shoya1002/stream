package streamsample;

import java.util.Arrays;
import java.util.List;

public class StreamSample {
	public static void main(String[] args) throws Exception {
		List<Integer> list = Arrays.asList(2, 2, 3, 4, 4, 4, 5, 7, 9);
		list.stream()
				.filter(i -> i >= 5)
				.forEach(i -> System.out.println(i));
	}
}