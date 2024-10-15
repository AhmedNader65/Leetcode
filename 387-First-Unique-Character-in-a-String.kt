class Solution {
    fun firstUniqChar(s: String): Int {
        val map = mutableMapOf<Char,Int>()
        s.forEach {
            map[it] = (map[it]?:0).plus(1)
        }
        var uniqChar =  map.filterValues { it == 1 }.firstNotNullOfOrNull { it.key }
        if (uniqChar == null)
            return -1
        s.forEachIndexed { index, c ->
            if (c == uniqChar)
                return index
        }
        return -1
    }
}