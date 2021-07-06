package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (x in 1..n) {
            var dividend = n.toBigInteger()
            for (i in n - 1 downTo n - x + 1)
                dividend *= i.toBigInteger()

            var divisor = 1.toBigInteger()
            for (i in 2..x)
                divisor *= i.toBigInteger()

            if (dividend / divisor == m.toBigInteger())
                return x
        }
        return null
    }
}
