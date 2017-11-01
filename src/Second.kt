/**
 * @author JHMI on 2017/11/1.
 * kotlin idioms 惯用语法的集合
 */
//1/create dtos POJOS
data class Customer(var name:String,var sex:String)
var Jermy = Customer("jermy","girl")

//2/Filtering a list
var lists = listOf<Int>(1,2,3)
var filter = lists.filter { lists->lists>1 }

var filter2 = lists.filter { it > 2 }

//3/Traversing a map/list of pairs
var map = mapOf<String,String>(Pair("a","aa"))

//4/Read-only
val map2 = mapOf("a" to 1,"b" to 2)

//5/Extension Functions
fun String.spaceTrans(){
    //do some
    println("some thing")
}
//6/Creating a singleton
object Single{
    val name = "luse"
}
//7/If not null shorthand
var shorthand : String? = "asd"

//8/Calling multiple methods on an object instance ('with')
class Turtle {
    fun penDown(){
        println("penDown")}
    fun penUp(){
        println("penUp")}
    fun turn(degrees: Double){
        println(degrees)
    }
    fun forward(pixels: Double){
        println(pixels)
    }
}

val myTurtle = Turtle()


fun main(args: Array<String>) {
    var jack = Customer("jack","boy")
    println(jack.toString())
    println(filter)
    println(filter.get(0) + filter.size)
    println("filter2="+filter2)

    map = map.plus(Pair("b","bb"))
    println(map.toString())
    for ((k,v) in map){
        println("$k-----$v")
    }
    println(map2.toString());
    var s = "asd"
    s.spaceTrans()
    println(Single.name)

    shorthand = null
    //?: 代表==null
    println(shorthand?.toString() ?:"empty")

    with(myTurtle) { //draw a 100 pix square
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    with(Jermy){
        println(this.name)
    }
}
