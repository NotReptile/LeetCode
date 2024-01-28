class Solution66 {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val newDigits = IntArray(digits.size + 1)
        newDigits[0] = 1
        return newDigits
    }
}

fun main(){
    val solution66 = Solution66()
    println(solution66.plusOne(intArrayOf(9,9)).joinToString(""))
}