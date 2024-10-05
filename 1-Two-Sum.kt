class Solution {
    
fun twoSum(nums: IntArray, target: Int): IntArray {
    val required = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            if(required.containsKey(nums[i])){
                return intArrayOf(required[nums[i]]!!,i)
            }else{
                required[target - nums[i]] = i
            }
        }
        return IntArray(2)
    }
}