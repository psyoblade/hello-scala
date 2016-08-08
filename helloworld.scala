var xxx = "hello world"
println(xxx)

println("1. 시퀀스의 출력이 간단함.")
(0 to 10).foreach(print)
println

println("2. 함수와 변수의 선언이 아주 유사함.")
var varInt:Int = 30
def defInt:Int = 30
println(varInt)
println(defInt)

println("3. 파라메터를 in 연산자를 통해 출력")
for (arg <- args) print(" " + arg)
println

println("4. Range를 리스트로 변환")
val a = (0 to 10).toList
println(a)

println("5. 리스트에 맵함수를 적용")
val b = a.map(x => x+1)
println(b)

println("6. 맵 결과에 리듀스함수 적용")
val c = b.reduce((x,y) => x+y)
println(c)

println("7. flatten 리스트")
val d = List(List(1,2), List(3,4))
println(d.flatten)

println("8. 리스트를 파라매터로 받아서 다시 맵 호출")
val e = d.map(x=>x.map(y=>y+1))
println(e)

println("9. 리스트 풀어쓰되 앞에 0 붙이기")
val f = d.flatMap(x=>0::x)
println(f)

println("10. 리스트 풀어쓰고 모두 풀어쓰기")
val g = d.flatMap(x => x.map(_ + 1))
println(g)

println("11. flat 은 한 번만 풀어주는가? YES")
val h = List(List(List(1,2,3)))
val i = h.flatMap(x => 0::x)
println(i)


println("12. List reduce, fold 결과")
val j = List(1,2,3,4,5)
val k = j.reduce { (p1:Int, p2:Int) => println("p1:" + p1 + "+p2:"+p2); p1+p2 }
val l = j.fold(10) { (p1:Int, p2:Int) => println("p1:"+p1+"p2:"+p2); p1+p2 }
println(k)
println(l)

def now(m:String) {
  import java.util.Calendar
  val current = Calendar.getInstance().getTime()
  println(m + ":" + current)
}

def start() : Long = {
  val s = System.currentTimeMillis;
  return s
}

def end(m:String, s:Long) {
  val e = System.currentTimeMillis;
  println(m + " function " + (e - s) + " elapsed")
}

var long_value = 2000000
long_value = 100
println("13. parallel map")
val list = (1 to long_value).toList

var s1 = start
list.map(_ + 42)
end("normal map", s1)

var s2 = start
list.par.map(_ + 42)
end("parallel map", s2)

val tuple = (1, "one", 1L)
println(tuple)


