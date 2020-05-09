package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = Integer.MIN_VALUE;
		for (int i : candies) {
			max = Math.max(i, max);

		}
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			list.add(false);
			if ((candies[i] + extraCandies) >= max) {
				list.set(i, true);
			}
		}
		return list;

	}

}
