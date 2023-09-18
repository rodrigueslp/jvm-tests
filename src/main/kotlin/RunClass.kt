class RunClass {

    fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Array<Int> {

        var countApple = 0
        var countOranges = 0
        for (apple in apples) {
            val fallsPoint = a + apple
            if (fallsPoint in s..t) countApple++
        }
        for (orange in oranges) {
            val fallsPoint = b + orange
            if (fallsPoint in s..t) countOranges++
        }
        return arrayOf(countApple, countOranges)

    }

    fun gradingStudents(grades: Array<Int>): Array<Int> {

        val arr = ArrayList<Int>()

        for (grade in grades) {

            if (grade < 38) {
                arr.add(grade)
                continue
            }

            var keepGoing = true
            var count = grade

            while (keepGoing) {
                if (count.mod(5) == 0) keepGoing = false else count++
            }
            if ((count - grade) < 3) arr.add(count)
            if ((count - grade) == 3) arr.add(grade)
        }

        return arr.toTypedArray()
    }

}

