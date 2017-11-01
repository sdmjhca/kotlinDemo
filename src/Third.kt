/**
 * @author JHMI on 2017/11/1.
 * kotlin Class constructor
 */
class Person (var name : String){
    constructor(name:String,parent:Person):this(name){
    }


}

fun main(args: Array<String>) {
    var person = Person("asd",Person("dsa"))
    println(person.name)
}

interface  Father{
    open fun fa1(){

    }
     fun fa2(){}
}
class Son : Father{
    override fun fa2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fa1() {
        super.fa1()
    }
}

abstract class Abstract(){
    fun fun1(){}
    abstract fun fun2()
}
open class Open(name: String){//如果不指定open 默认final
    open fun fun1(){

    }
    fun fun2(){
        println("不可以被重写")
    }
}
