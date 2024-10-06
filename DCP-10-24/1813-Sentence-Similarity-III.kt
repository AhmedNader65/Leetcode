class Solution {
    
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        val s1Words = sentence1.split(" ")
        val s2Words = sentence2.split(" ")
        
        // Make sure s1Words is always the longer or equal length sentence
        if (s1Words.size < s2Words.size) {
            return areSentencesSimilar(sentence2, sentence1)
        }
        
        var leftIndex = 0
        var rightIndex = 0
        
        // Check matching from the start
        while (leftIndex < s2Words.size && s1Words[leftIndex] == s2Words[leftIndex]) {
            leftIndex++
        }

        // Check matching from the end
        while (rightIndex < s2Words.size && s1Words[s1Words.size - 1 - rightIndex] == s2Words[s2Words.size - 1 - rightIndex]) {
            rightIndex++
        }
        
        // If the total matched words from both sides cover the whole shorter sentence
        return leftIndex + rightIndex >= s2Words.size
    }
}