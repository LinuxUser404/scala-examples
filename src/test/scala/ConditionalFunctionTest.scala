import org.scalatest.{Matchers, FunSuite}

/** @version 1.1.0 */
class ConditionalFunctionTest extends FunSuite with Matchers {

  test("Times 10") {
    ConditionalFunction.evalTimes10(List(1, 2, 3)) should be (List(10, 20, 30))
  }

  test("Plus 10") {
    ConditionalFunction.evalPlus10(List(1, 2, 3)) should be (List(11, 12, 13))
  }

  test("Alternate starting with Plus") {
    ConditionalFunction.evalAlternatePlus(List(1, 2, 3)) should be (List(11, 20, 13))
  }

  test("Alternate starting with Times") {
    ConditionalFunction.evalAlternateTimes(List(1, 2, 3)) should be (List(10, 12, 30))
  }
}
