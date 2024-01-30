class Solution58 {
    fun lengthOfLastWord(s: String): Int {
        var c = 0
        for (i in s.reversed()) {
            if (!i.isWhitespace())
                c++
            else if (c > 0)
                return c
        }
        return 0
    }
}

fun main() {
    val solution58 = Solution58()
    println(solution58.lengthOfLastWord("Hello   World     "))
}