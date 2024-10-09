class Solution {
    fun lengthOfLastWord(s: String): Int {
        val s2 = s.trim().split(\ \)
        val s3 = s2[s2.size-1]
        return s3.length
    }
}