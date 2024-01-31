class Solution69 {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        var left = 0L
        var right = x.toLong()
        var sqrt: Long
        while (true) {
            sqrt = (left + right) / 2
            if (sqrt * sqrt <= x && (sqrt + 1) * (sqrt + 1) > x) {
                break
            }
            if (sqrt * sqrt > x) {
                right = sqrt
            } else {
                left = sqrt + 1
            }
        }
        return sqrt.toInt()
    }
}

fun main(){
    val solution69 = Solution69()
    println(solution69.mySqrt(9))
}