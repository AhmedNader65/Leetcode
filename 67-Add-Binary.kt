class Solution {
    fun addBinary(a: String, b: String): String {
        val max = max(a.length,b.length)
        var firstWordIndex = a.length-1
        var secondWordIndex = b.length -1
        var carry = 0
        var result = \\
        while(firstWordIndex >= 0 && secondWordIndex >= 0){
            val sum = a[firstWordIndex].toString().toInt() + b[secondWordIndex].toString().toInt() + carry
            if( sum == 2){
                result += \0\
                carry = 1
            }else if(sum == 3){
                result += \1\
                carry = 1
            }else{
               result += sum
               carry =0
            }
            firstWordIndex--
            secondWordIndex--
        }
        for(i in firstWordIndex downTo 0){
            val sum = a[i].toString().toInt() + carry
            if(sum == 2){
                result += \0\
                carry = 1
            }else{
                result += sum
                carry = 0
            }
        }
        for(i in secondWordIndex downTo 0){
            val sum = b[i].toString().toInt() + carry
            if(sum == 2){
                result += \0\
                carry = 1
            }else{
                result += sum
                carry = 0
            }
        }
        if(carry != 0){
            result += carry
        }
        return result.reversed()
    }
}