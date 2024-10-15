class Solution {
    fun reverse(x: Int): Int {
        var isNegative = false
        var s : StringBuilder = StringBuilder(x.toString())
        if(x < 0){
            isNegative = true
            s =  StringBuilder((x * -1).toString())
        }
        var leftPointer = 0
        var rightPointer = s.length -1
        while(leftPointer < rightPointer){
            val temp = s.get(rightPointer)
            s[rightPointer] = s[leftPointer]
            s[leftPointer] = temp
            leftPointer++
            rightPointer--
        }
        
        return try{
            if(isNegative) -1 * s.toString().toInt() else s.toString().toInt()
        }catch(e: NumberFormatException){
            0
        }
    }
}