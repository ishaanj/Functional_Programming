class Rational(x: Int, y: Int) {

  require( y != 0, "Denominator cannot be zero")

  val numerator = x / gcd(x, y)
  val denominator = y / gcd(x, y)

  private def gcd(x: Int, y: Int): Int =
    if(y == 0)
      x
    else
      gcd(y, x % y)

  def <(second: Rational) =
    numerator * second.denominator < second.numerator * denominator

  def max(second: Rational) =
    if(<(second))
      second
    else
      this

  def this(x: Int) =
    this(x, 1)

  def +(second: Rational) =
    new Rational (numerator * second.denominator + second.numerator * denominator, denominator * second.denominator)

  override def toString() =
    numerator + "/" + denominator

  def unary_- : Rational =
    new Rational (-numerator, denominator)

  def -(second: Rational) =
    this+(-second)

}

val x = new Rational(1, 2)
val temp = new Rational(2)
val y = new Rational(1, 3)
val z = new Rational(3, 2)
x - y - z
x + y
y < x
y max x
y max x
x + x + y - y
