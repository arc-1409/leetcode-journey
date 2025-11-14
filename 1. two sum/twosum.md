### problem

level: easy
tags: array, hash table

the most intuitive way of solving this problem is to brute force it: iterate through every index (`x = 0`), and then use a nested for loop to iterate through the rest of the indices (`y = x+1`). but that's one extra variable space to keep track of (`y`), when it can be replaced by `target - nums[x]`. 

a hashmap can store key-value pairs, and by adding every value in `nums` as the hashmap's key and its index as the hashmap's value, we can very quickly search through the hashmap for `target - nums[x]`. when found, we can then extract the index to be returned in the end.

### findings & things learnt

### research results

### possible edge cases (for secure programming)

- exactly two elements in `nums`
- negative number elements or zeroes
- multiple elements matching target
- target not found; throw an error

### leetcode tips

- avoid nested loops if possible; it's much slower with the O(n^2) quadratic time complexity, where n is the length of the array
- use hashmaps instead to easily look up target and target index