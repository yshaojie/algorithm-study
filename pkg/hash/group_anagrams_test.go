package hash

import (
	"fmt"
	"testing"
)

func TestGroupAnagrams(t *testing.T) {
	strs := []string{"eat", "tea", "tan", "ate", "nat", "bat"}
	anagrams := groupAnagrams(strs)
	for i := 0; i < len(anagrams); i++ {
		println(anagrams[i])
	}
	println(fmt.Sprint(anagrams))
}
