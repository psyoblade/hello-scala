
def test_mutability {
  // -> 은 . 으로 치환되고 Tuple 을 반환하는 실험
  var map = scala.collection.mutable.Map[Int, String]()
  map += (1 -> "one")
  map += (2 -> "two")
  map += ((3, "three")) // 직접 넣고 싶으면, 큰 튜플 안에 #개의 튜플을 넣어야 한다.
  println(map(1))
  println(map(2))
  println(map(3))

  var immutableMap = scala.collection.immutable.Map.apply((1,"one"), (2,"two"))
  println(immutableMap(1))
  println(immutableMap(2))
}

def test_fileopen {
  import scala.io.Source

  if (args.length > 0) {
    println(args(0))
    for (line <- Source.fromFile(args(0)).getLines())
      println(line)
  }
}

def method(m:Int) : Int = { return 1 }
def method(m:String) : Int = { return 2 }
// def method(m:String) : String = { return "3" }

def test_signature {
  println(method(1))
  println(method("m"))
}
// test_signature

class Complex(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}

def test_val_compare {
  val s1 = "string1"
  val s2 = "string1"
  if (s1 == s2) println("value equal")
  if (s1 equals s2) println("value also equal")
}

def test_ref_compare {
  val s1 = "string1"
  val s2 = "string1"
  if (s1 eq s2) println("ref not equal")
}

test_val_compare
test_ref_compare



