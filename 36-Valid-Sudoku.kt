class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rowSet = mutableSetOf<Char>()
        var columnSet = mutableSetOf<Char>()
        val boxes = Array<MutableSet<Char>>(9) { HashSet() }
        for (i in 0 until board.size) {
            for (j in 0 until board.size) {
                val rowChar = board[i][j]
                if (!rowSet.add(rowChar) && rowChar != '.') {
                    return false
                }
                val columnChar = board[j][i]
                if (!columnSet.add(columnChar) && columnChar != '.') {
                    return false
                }

                val boxIndex = (i / 3) * 3 + (j / 3)
                if (!boxes[boxIndex].add(rowChar) && rowChar != '.' ) return false // Duplicate in box

            }
            rowSet.clear()
            columnSet.clear()
        }
        return true
    }
}