class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var leftIndex = 0
        var rightIndex = 0

        while (rightIndex < nums.size) {
            if (nums[rightIndex] != `val`) {
                nums[leftIndex] = nums[rightIndex]
                leftIndex++
            }
            rightIndex++
        }
        
        return leftIndex
    }
}