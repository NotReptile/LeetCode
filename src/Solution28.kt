class Solution28 {
    fun strStr(haystack: String, needle: String): Int {
        var i = 0
        val last = needle.length - 1
        if (needle.length > haystack.length) return -1

        while (i < haystack.length - last) {
            var j = 0
            while (j < needle.length && haystack[i + j] == needle[j]) {
                j++
            }
            if (j == needle.length)
                return i
            else
                i++
        }
        return -1
    }
}

fun main() {
    val solution28 = Solution28()
    println(solution28.strStr("mississippi", "issip"))
}