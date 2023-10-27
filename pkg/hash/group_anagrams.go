package hash

// https://leetcode.cn/problems/group-anagrams/
// 用质数表示26个字母，把字符串的各个字母相乘，这样可保证字母异位词的乘积必定是相等的。其余步骤就是用map存储
func groupAnagrams(strs []string) [][]string {
	ma := make(map[int][]string)
	for _, str := range strs {
		mu := multiply(str)
		vals := ma[mu]
		vals = append(vals, str)
		ma[mu] = vals
		println(vals, "=", str)
	}
	var results [][]string
	for _, strings := range ma {
		results = append(results, strings)
	}
	return results
}

func multiply(str string) int {
	primes := []int{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103}
	multiply := 1
	for _, val := range str {
		multiply = multiply * primes[val-'a']
	}
	return multiply
}
