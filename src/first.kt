/**
 * @author JHMI on 2017/10/31.
 * basic syntax基本语法
 */
fun main(args: Array<String>) {
    var a = 2;
    var b = 3;
    println("hello world!"+sum(a,b))
    //2/string templates
    var s = "hello a $a";
    println(s)
    a = sum(a,b);
    s = "${s.replace("a","b")}, now a= $a"
    println(s)
    //4/Using a for loop
    var lists = listOf("a","b")

    for( list in lists){
        println(list)
        println(lists.indices)
    }

    des("hello")
    //var[] list = ["a","b","c"];
    //6/range step over
    for (x in 1..5 step 3){
        println(x)
    }

    var aInt:Int = 1
    var aDouble : Double = 1.0
    var aLong : Long = 2L
    var aFloat : Float = 1.0f
    var aShort : Short = 25719
    var aByte : Byte = 127

    //You can use underscores to make number constants more readable:
    var oneMillion = 1000_000
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(bytes)

    val aaa: Int = 10000
    print(aaa === aaa) // Prints 'true'
    val boxedA: Int? = aaa
    val anotherBoxedA: Int? = aaa
    print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

    // Hypothetical code, does not actually compile:
    val aaaa: Int? = 1 // A boxed Int (java.lang.Integer)
    val bb: Long? = 1 // implicit conversion yields a boxed Long (java.lang.Long)
   // print(aaaa == bb) // Surprise! This prints "false" as Long's equals() check for other part to be Long as well

    var asc = Array(5,{(it*it).toString()})
    println(asc)
}

//1/fun
fun sum(a:Int,b:Int) :Int{

    return a+b;
}

//3/Using type checks and automatic casts
//?表示允许返回null
fun getVarLength(s:Any):Int?{
    if(s is String){
        return s.length;
    }
    return null;
}
//5/Using when expression
fun des(obj:Any){
    when(obj){
        "hello" -> {
            println("$obj world")
            println("${obj.toString().replace("h","hi")},world")
        }
        1 -> print(2)
        else -> println("un known")
    }

}
