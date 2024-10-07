class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
          if (strs.isEmpty()) return ""

        // Find the shortest string in the array
        val min = strs.minByOrNull { it.length } ?: return ""

        var currentPrefix = ""

        for (i in min.indices) {
            // Get the character from the first string
            val currentChar = min[i]
            // Check if this character is present in all strings
            for (str in strs) {
                if (str[i] != currentChar) {
                    return currentPrefix
                }
            }
            // If all strings matched, add the character to the prefix
            currentPrefix += currentChar
        }

        return currentPrefix
    }
}