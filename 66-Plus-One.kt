class Solution {
    fun plusOne(digits: IntArray): IntArray {
        // Start from the last digit
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            // Set current digit to 0 if it's 9
            digits[i] = 0
        }
        // If we are here, it means we need to add a new digit at the front
        return IntArray(digits.size + 1).apply { this[0] = 1 }
    }
}