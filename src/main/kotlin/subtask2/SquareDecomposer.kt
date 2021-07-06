package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number, number.pow())
    }

    private fun decompose(number: Int, temp: Long): Array<Int>? {
        for (i in number - 1 downTo 1) {
            if (i.pow() != temp) {
                val remainder = temp - i.pow()
                if (remainder > 0) {
                    val array = decompose(i, remainder)
                    if (array != null)
                        return array.plus(i)
                }
            } else return arrayOf(i)
        }
        return null
    }

    private fun Int.pow(): Long = this.toLong() * this.toLong()
}


