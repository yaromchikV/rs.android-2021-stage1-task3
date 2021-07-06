package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        return if (number[0] != '-') {
            val list = arrayListOf<String>()
            number.forEachIndexed { i, digit ->
                getNeighbors(digit).forEach {
                    list.add(number.substring(0, i) + it + number.substring(i + 1))
                }
            }
            list.toTypedArray()
        } else null
    }

    private fun getNeighbors(digit: Char) = when (digit) {
        '1' -> arrayOf('2', '4')
        '2' -> arrayOf('1', '3', '5')
        '3' -> arrayOf('2', '6')
        '4' -> arrayOf('1', '5', '7')
        '5' -> arrayOf('2', '4', '6', '8')
        '6' -> arrayOf('3', '5', '9')
        '7' -> arrayOf('4', '8')
        '8' -> arrayOf('5', '7', '9', '0')
        '9' -> arrayOf('6', '8')
        '0' -> arrayOf('8')
        else -> arrayOf()
    }
}
