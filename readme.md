# Kotling Fundamentals

## I. Getting started

### Immutability

### String templates

(pieces of code that are evaluated and whose results are concatenated into the string)

_**$ sign**_ for integrating a string variables inside a string 
$ is bound to an instance or a variable based on needs or context.

### If statement as an expression

    val message = if(q.Answer == q.CorrectAnswer)
        "You were correct"
     else
          "Wrong"

An awesome thing happened right here. Instead of giving to the message variable in one of the if branches a value we can easily just give it 
the if value given in the if expression.

The message variable can also be immutable because it's value doesn't change.

### Handling of Null Value

In kotlin variables can not be null unless we are telling the compiler that a null value in a variable is allowed.
We do that by adding _?_ to the end of the variable declared type.

    var Answer:String? = null
    
If a variable is allowed to be null, we need to use the 'Only safe or null asserted calls' by also using the _?_ sign.

    val q:Question? = Question()
    q?.Answer = null
    q?.Answer = "42"

If the variable is actually null, it's not failing, is just passing through and declares that it's null.

### When statement ( a very powerful statement)

        fun printResult(){
            when (Answer) {
                CorrectAnswer -> print("You were correct")
                else -> print("Wrong")
            }
        }

It's like a Java switch, but more powerful.

### Try in Kotlin


    val number:Int? = try{
        Integer.parseInt(q?.Answer)
    } catch (e:NumberFormatException){
        null
    }

All exception classes in Kotlin are descendants of the class Throwable. Every exception has a message, stack trace and an optional cause.

The returned value of a try-expression is either the last expression in the try block or the last expression in the catch block (or blocks). _Contents of the finally block do not affect the result of the expression._

### Loops

In Kotlin we define a range of values.

    var myValues = 1..10
    
    for(i in 1..10 step 2) ...
    
    for(i in 1 until 11) print(i)

Iterating though a map 
    
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Leo"] = 44

    for((name, age) in ages){
        println("$name is $age")
    }
    
As we can see, the _for lop_ binds the variable names to the keys/values of the map so they can be much more easier to use.

