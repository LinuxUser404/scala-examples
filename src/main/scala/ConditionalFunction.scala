object ConditionalFunction {
  private var isTimes: Boolean = true
  private val times: Int => Int = x => {isTimes = !isTimes; x * 10}
  private val plus:  Int => Int = x => {isTimes = !isTimes; x + 10}

  private def myDefMethod(x: Int): Int = {
    if (isTimes) times(x)
    else plus(x)
  }

  private def myDefFunction: Int => Int = {
    if (isTimes) times
    else plus
  }

  private val myValFunction: Int => Int = {
    if (isTimes) times
    else plus
  }

  def evalTimes10(l: List[Int]) = {
    isTimes = !isTimes
    l.map(myValFunction)
  }

  def evalPlus10(l: List[Int]) = {
    isTimes = !isTimes
    l.map(myDefFunction)
  }

  def evalAlternatePlus(l: List[Int]) = {
    isTimes = !isTimes
    l.map(myDefMethod)
  }

  def evalAlternateTimes(l: List[Int]) = {
    val valTimes: Int => Int = {isTimes = !isTimes; _ * 10}
    isTimes = !isTimes
    l.map(myDefMethod)
  }
}
