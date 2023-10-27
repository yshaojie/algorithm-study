package hash

import (
	"math"
	"sort"
)

func longestConsecutive(nums []int) int {
	sort.Ints(nums)
	max := 0
	tmp := 1
	for i := 0; i < len(nums)-1; i++ {
		if nums[i]+1 == nums[i+1] {
			tmp++
		} else {
			max = int(math.Max(float64(max), float64(tmp)))
			tmp = 1
		}
	}
	return max
}
