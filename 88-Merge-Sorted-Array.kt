class Solution {
       

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var n1Index = m - 1
    var n2Index = n - 1
    var mergeIndex = m + n - 1

    while (n1Index >= 0 && n2Index >= 0) {
        if (nums1[n1Index] >= nums2[n2Index]) {
            nums1[mergeIndex] = nums1[n1Index--]
        } else {
            nums1[mergeIndex] = nums2[n2Index--]
        }
        mergeIndex--
    }
    while (n2Index >= 0) {
        nums1[mergeIndex] = nums2[n2Index]
        n2Index--
        mergeIndex--
    }
    println(nums1.joinToString(\,\))
}
 
    }
