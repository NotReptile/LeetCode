class Solution1043 {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val dp = IntArray(arr.size)
        dp[0] = arr[0]
        for (i in 1 until arr.size) {
            var max = arr[i]
            var j = i
            while (j >= 0 && i - j + 1 <= k) {
                max = kotlin.math.max(max, arr[j])
                dp[i] = kotlin.math.max(dp[i], (if (j - 1 >= 0) dp[j - 1] else 0) + (i - j + 1) * max)
                j--
            }
        }
        return dp[arr.size - 1]
    }
}

fun main(){
    val solution1043 = Solution1043()
    println(solution1043.maxSumAfterPartitioning(intArrayOf(1,4,1,5,7,3,6,1,9,9,3),4))
}