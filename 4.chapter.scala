object foo { // 동반객체 companion object
  private val foo_var_1 = 1
  def dummy {
    println("object foo method called")
    val ii = new foo
    println("access companion class var" + ii.foo_var_2)
  }
}
class foo { // 동반클래스 companion class
  private val foo_var_2 = 2
  def dummy {
    println("class instance foo method called")
    println("access companion object var" + foo.foo_var_1)
  }
}
class bar { // 일반클래스
  def dummy {
    println("class instance bar method called")
  }
  def bar_not_dummy {
    println("class instance bar not_dummy method called")
  }
}
object foobar { // 독립객체 standalone object
  def foo_not_dummy {
    println("class instance foobar not_dummy method called")
  }
}

// 그냥 생성하면 싱글톤을, 뉴 하면 인스턴스를
foo.dummy
val o = foo
val i = new foo
i.dummy
// 인스턴스는 반드시 뉴 키워드가 필요함.
val b = new bar
// 일반 싱글톤 객체의 퍼브릭 메소드도 정적 임포트가 가능하다
import foobar.foo_not_dummy
foo_not_dummy
// 일반 객체의 메소드도 가능한가?
val xxx = new bar
import xxx.bar_not_dummy
bar_not_dummy

