package com.krisbunda.utut

// Kotlin starting/entry point func:
fun main() {
    // TODO: a special note reminder
    var myName = "Kris "
    // VAL = immutable variable
    val yourName = "Killswitch"
    print("hello " + myName + yourName + " !" + "\r\n")

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

    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    // operator with = sign
    result /= 2
    result += 2
    result -= 2
    result *= 2
    result %= 5 // modulo

    val carriageReturn = " \r\n"

    print("The answer is: $result$carriageReturn")


}