class Solution {
    
    fun strStr(haystack: String, needle: String): Int {
        var leftIndex = 0
        var rightIndex = needle.length - 1
        while (rightIndex < haystack.length) {
            if (haystack.substring(leftIndex, rightIndex + 1) == needle) {
                return leftIndex
            }
            leftIndex++
            rightIndex++
        }
        return -1
    }
}