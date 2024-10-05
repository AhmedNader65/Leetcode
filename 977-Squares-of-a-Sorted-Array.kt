class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var squares = IntArray(nums.size)
        nums.forEachIndexed{index, num->
            squares[index] = num * num
        }
        
        quickSort(squares, 0, squares.size - 1)
        return squares

    }
    
    fun quickSort(array: IntArray, low: Int, high: Int){
        if(low < high){
            val pivotIndex = partition(array, low, high)
            
            quickSort(array, low , pivotIndex -1)
            quickSort(array, pivotIndex + 1 , high)
        }
    }
    
    fun partition(array: IntArray, low: Int, high: Int) : Int{
        
        var mid = low + ((high - low)/ 2)
        var pivot = array[mid]
        swap(array, mid , high)
        
        var i = low - 1
        
        for( j in low until high){
            if(array[j] <= pivot){
                i++
                swap(array, i , j)
            }
        }
        
        swap(array, i + 1 , high)
        
        return i+1
    }
    
    fun swap(array: IntArray, i: Int, j: Int){
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
    
//     fun mergeSort(squares: IntArray): IntArray{
//         if(squares.size <= 1){
//             return squares
//         }
        
//            val mid = squares.size / 2
//          val leftArray = mergeSort(squares.copyOfRange(0,mid))
//          val rightArray = mergeSort(squares.copyOfRange(mid,squares.size))
         
//          return merge(leftArray,rightArray)
//     }
    
//     fun merge(left: IntArray, right: IntArray): IntArray{
//         var (i, j, k) = Triple(0, 0, 0)
//         val resultArray = IntArray(left.size + right.size)
//         while(i < left.size && j < right.size){
//             if(left[i] <= right[j]){
//                 resultArray[k] = left[i]
//                 i++
//             }else{
//                 resultArray[k] = right[j]
//                 j++
//             }
//             k++
//         }
//         for(m in i until left.size){
//             resultArray[k] = left[m]
//             k++
//         }
//         for(m in j until right.size){
//             resultArray[k] = right[m]
//             k++
//         }
        
//         return resultArray
//     }
}