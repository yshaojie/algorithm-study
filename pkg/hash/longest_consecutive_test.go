package hash

import (
	"testing"
)

func TestLongestConsecutive(t *testing.T) {
	ints := []int{100, 4, 200, 1, 3, 2}
	count := longestConsecutive(ints)
	println(count)
}
