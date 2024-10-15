class Solution {
    fun reverseString(s: CharArray): Unit {
        var leftPointer = 0
        var rightPointer = s.size -1
        while(leftPointer < rightPointer){
            var temp = s[rightPointer]
            s[rightPointer] = s[leftPointer]
            s[leftPointer] = temp
            leftPointer++
            rightPointer--
        }
    }
}