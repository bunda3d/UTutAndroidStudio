/*
*  This is a reference page for Kotlin,
*  typed when I took this Udemy course
*  to learn deeper domain on using Android
*  Studio for native & cross-platform dev.
*  https://www.udemy.com/share/102JgoA0Eec15WRnw=/
*/

package com.krisbunda.utut

// Kotlin starting/entry point func:
fun main() {
    // TODO: how we make a special reminder note in Kotlin
    //  and in Android Studio. These can be found as a list
    //  of items later (in Android Studio > TO-DO menu tab)
    var myName = "Kris "
    // VAL = immutable variable
    val madMaxName = "Killswitch"
    print("hello " + myName + madMaxName + " !" + "\r\n")

    // diff types of integer vars:
    // syntax: {var name}{colon}{type}
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_858_392_555
    // type Byte = 8 bit // Short = 16bit
    // type Int = 32bit // typeLong = 64bit

    // more number types:
    // Float must end with F
    val myFloat: Float = 14.4743F
    // Double is more accurate than Float
    val myDouble: Double = 3.1415999999999999
    // Floating Point number Types:
    // Float = 32bit // Double 64bit

    // Booleans can have 2 values (T or F)
    var isSunny: Boolean = true
    // now weather has changed
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '$'

    // Strings
    val myStr = "Hello Whirling Dervishes"
    // 1st char in string
    var firstCharInStr = myStr[0]
    // last char in string
    var lastCharInStr = myStr[myStr.length - 1]

    print("Last Character in " + myStr + " is " +
            '"' + lastCharInStr + '"' + "\r\n")

    // type inference: Usually Kotlin code
    // understands the type without needing to specifiy.
    var myAge = 40

    // ARITHMETIC OPERATORS (+, -, *, /, %)
    var result = 5 + 3
    // operator with = sign
    result /= 2
    result += 2
    result -= 2
    result *= 2
    result %= 5 // modulo / remainder

    // separate lines, or typewriter "carriage return"
    val carriageReturn = " \r\n"

    print("The answer is: $result$carriageReturn")

    // COMPARISON OPERATORS (==, !=, <, >, <=, >=)
    // compare = bool = false
    val isEqual = 5 == 3
    // isNotEqual = bool = true
    val isNotEqual = 5 != 3

    // start some STRING INTERPOLATION examples...
    println("isNotEqual is $isNotEqual")
    // compare = bool = false
    // how to run calculation inside a template!
    println("is5Greater3 ? ${-5 > 3}")
    println("is5LowerEqual3 ? ${5 <= 3}")
    println("is5GreaterEqual5 ? ${5 >= 5}")

    // ASSIGNMENT OPERATORS (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")

    // INCREMENT & DECREMENT OPERATORS (+=, -=, *=, /=, %=)
    // increasing val by 1 (to 33)
    myNum++
    println("myNum is $myNum")
    // notice: incrementing in string (to 33)
    // incrementing up BUT don't see it
    // as they're at the end of line (not printed)
    println("myNum is ${myNum++}")
    // (to 35)
    // incrementing up BUT doing it before end of line is
    // printed (so, see both last line's increment and this line's)
    println("myNum is ${++myNum}")
    // decrement (to 34)
    println("myNum is ${--myNum}")

    // IF STATEMENTS
    var heightPerson1 = 170
    var heightPerson2 = 189
    // should the persons fight or use technique/?
    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    // IF STATEMENTS
    val legalAge = 20
    if (legalAge >= 21) {
        println("You can drink at a bar in the U.S.")
    } else if (legalAge >= 18) {
        println("You are old enough to vote")
    } else if (legalAge >= 16) {
        println("You are old enough to drive a vehicle")
    } else {
        println("You are too young for any fun...")
    }


    // IF STATEMENTS (using Ranges)
    val Age = 13
    if (Age in 21..130) {
        println("You can drink at a bar in the U.S.")
    } else if (Age in 18..20) {
        println("You are old enough to vote")
    } else if (Age in 16..17) {
        println("You are old enough to drive a vehicle")
    } else {
        println("You are too young for any fun...")
    }

    // IF STATEMENTS (more)
    var name = "Kris"
    val ownerName = "Kris"
    if (name == ownerName) {
        println("Welcome home $name")
    } else {
        println("Who are you?")
    }
    var isRainy = false
    if (isRainy)
        println("It's rainy.")
    else
        println("It's not rainy.")


    // WHEN STATEMENTS
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    //WHEN STATEMENTS (with ranges)
    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("invalid Season")
    }
    //WHEN STATEMENTS (with ranges)
    val whenAge = null
    when (whenAge) {
        in 21..130 -> println("You can drink at a bar in the U.S.")
        in 18..20 -> println("You are old enough to vote")
        in 16..17 -> println("You are old enough to drive a vehicle")
        // else -> println("You are too young for any fun...")
        // another way of putting "else":
        !in 16..130 -> println("You are too young for any fun...")
    }

    //WHEN STATEMENTS (with "IS" keyword & TYPE CHECKING)
    var x: Any = 13.37f // f=float
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is of unknown type")
    }





    println(carriageReturn)


}