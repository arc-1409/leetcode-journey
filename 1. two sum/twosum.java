import java.util.HashMap;
import java.util.Map;

// bruteforce

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
}

// use hashmap

class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int x = target - nums[j];
            if (m.containsKey(x) && m.get(x) != j) {
                return new int[] {j, m.get(x)};
            }
        }

        return new int[] {};
    }
 }

 /* 
 * research: new int[] {i, j};
 * research: ln 20, Map ... new HashMap?
 * findings: the "public" data type specifies the return data type
 * learn: map.put, containsKey(), get()
 * tips: avoid nested loops if possible; use hashmaps instead 
 */