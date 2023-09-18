import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RunClassTest {

    val runClass: RunClass = RunClass()

    @Test
    fun countApplesAndOranges_whenValidValuesArePassed_thenReturnResult() {
        val result = runClass.countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
        Assertions.assertEquals(2, result.size)
    }

}