import java.util.*

fun main(args: Array<String>){
    println("Hello, world")

    val q:Question? = Question()

    q?.Answer = null
    q?.Answer = "babnana"

    println("the answer is ${q?.Answer} ")

    val message = if(q?.Answer == q?.CorrectAnswer)
        "You were correct"
     else
          "Wrong"


    println(message)

    q?.printResult()

    val number:Int? = try{
        Integer.parseInt(q?.Answer)
    } catch (e:NumberFormatException){
        null
    }

    println("Number is $number")

    for(i in 1 until 11) print(i)

    println()
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Leo"] = 44

    for((name, age) in ages){
        println("$name is $age")
    }
}

class Question{

    var Answer:String? = ""
    val Question: String = "What is the asnwer to life?"

    val CorrectAnswer = "42"

    fun display(){
        println("you said $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Wrong")
        }
    }
}