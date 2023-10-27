package hash

// https://leetcode.cn/problems/two-sum/
func twoSum(nums []int, target int) []int {
	values := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		values[nums[i]] = i
	}
	for i := 0; i < len(nums); i++ {
		index, ok := values[target-nums[i]]
		if ok && i != index {
			return []int{i, index}
		}
	}
	return []int{-1, -1}
}
