package playground;

import java.util.Arrays;

public class Playground {

	public static void main(String[] args) {
		int[] arr = {5, 9, 123, 92, 1, 10, 2};
		arr = Arrays.stream(arr)
			.filter(e -> e>5 )
			.sorted()
			.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
