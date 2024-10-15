class Solution {
    fun myAtoi(s: String): Int {
           var foundSignal = false
            var isNegative = false
            var numberSt = \0\
            for (i in s.indices) {
                val c = s[i]
                if ((c == '-' && !foundSignal) || (c == '+' && !foundSignal) || c == ' ' || c.isDigit()) {
                    if (c == '-') {
                        isNegative = true
                        foundSignal = true
                    } else if (c == '+') {
                        isNegative = false
                        foundSignal = true
                    } else if (c.isDigit()) {
                        foundSignal = true
                        numberSt += c
                    }else if(foundSignal){
                        break
                    }
                } else {
                    break
                }
            }
            var result = try {
                numberSt.toInt() * if (isNegative) -1 else 1
            } catch (e: NumberFormatException) {
                if (isNegative) {
                    (Int.MAX_VALUE * -1) - 1
                } else {
                    Int.MAX_VALUE
                }
            }
            return result
    }
}