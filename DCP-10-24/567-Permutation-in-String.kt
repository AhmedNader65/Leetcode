class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length ) return false
        val s1Freq = IntArray(26)
        val s2Freq = IntArray(26)

        for(i in 0 until s1.length){
            s1Freq[s1[i] - 'a']++
            s2Freq[s2[i] - 'a']++
        }

        for( i in 0 until s2.length - s1.length){
            if(match(s1Freq, s2Freq)) return true
            s2Freq[s2[i] - 'a']--
            s2Freq[s2[s1.length + i] - 'a']++
        }
        return match(s1Freq, s2Freq)
    }

    fun match(freq1: IntArray, freq2:IntArray): Boolean{
        for(i in freq1.indices){
            if(freq1[i] != freq2[i]) return false
        }
        return true
    }
}