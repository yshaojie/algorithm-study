package main

func main() {

}

func LongestPrefix(a, b string) string {
	for i := 0; i < len(a) && i < len(b); i++ {
		if a[i] != b[i] {
			return a[0 : i-1]
		}
	}
	return a
}
