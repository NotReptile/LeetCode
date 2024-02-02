class Solution1291 {
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val result = mutableListOf<Int>()
        if (high < 12)
            return result
        var digits = "123456789"
        var count = 0
        while (count < 9) {
            for (x in digits.length-1 downTo 0) {
                if (digits.dropLast(x).toInt() in low..high && digits.dropLast(x).length > 1)
                    result+=digits.dropLast(x).toInt()
            }
            digits = digits.drop(1)
            count++
        }
        return result.sorted()
    }
}

fun main(){
    val solution1291 = Solution1291()
    println(solution1291.sequentialDigits(10, 1000000000))
}