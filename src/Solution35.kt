class Solution35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var s = 0
        var index = nums.size / 2
        if (target < nums[0])
            return 0
        else if (target > nums[nums.size - 1])
            return nums.size
        while (index >= 0 && index < nums.size) {
            if (nums[index] == target) {
                return index
            } else if (nums[index] > target) {
                index--
                if (s == 1 && nums[index] < target)
                    return ++index
                else if (s == 1)
                    return index
                s = -1
            } else {
                index++
                if (s == -1)
                    return index
                s = 1
            }
        }
        return index
    }
}

fun main() {
    val solution35 = Solution35()
    println(solution35.searchInsert(intArrayOf(1, 3, 5, 6), 2))

}