class Solution387 {
    fun firstUniqChar(s: String): Int {
        val map = s.groupingBy { it }.eachCount()
        return s.indexOf(map.filterValues { it == 1 }.keys.firstOrNull() ?: return -1)
    }
}

fun main(){
    val solution387 = Solution387()
    println(solution387.firstUniqChar("loveleetcode"))
}