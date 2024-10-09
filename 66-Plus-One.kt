class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var numSt = \\
        digits.forEach{d->
            numSt += d
        }
        var num = numSt.toBigInteger()
        num++
        numSt = num.toString()
        val result = IntArray(numSt.length)
        for(i in 0 until result.size){
            result[i] = numSt[i].toString().toInt()
        }
        return result
    }
}