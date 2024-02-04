import kotlin.math.min

class Solution76 {
    fun minWindow(s: String, t: String): String {
        val dictT = IntArray(128)
        t.forEach { dictT[it.code]++ }

        var left = 0
        var right = 0
        var formed = 0
        val required = t.length
        var minLen = Int.MAX_VALUE
        var minString = ""

        while (right < s.length) {
            val c = s[right]
            dictT[c.code]--

            if (dictT[c.code] >= 0) formed++

            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1
                    minString = s.substring(left, right + 1)
                }
                val leftChar = s[left]
                dictT[leftChar.code]++
                if (dictT[leftChar.code] > 0) formed--
                left++
            }
            right++
        }
        return minString
    }
}

fun main(){
    val solution76 = Solution76()
    println(solution76.minWindow("ADOBECODEBANC","ABC"))
}