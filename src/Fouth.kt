import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const

/**
 * @author JHMI on 2017/11/1.
 * fields and properties
 * const 常数
 * lateinit   后期初始化属性
 */
const val CONST:String = "这是常数"

class Field(init : Int){

    var byDefault : Int? = 1
        get() {
            return field
        }
        set(value) {field = value}

    val default : Int? = init

    lateinit var field:Field

    fun set(){
        field = Field(2)
    }
}

fun main(args: Array<String>) {

    var field = Field(1)
    //field.default.get
    println(field.byDefault)

     field.set()
    println(field.field.default)
}

