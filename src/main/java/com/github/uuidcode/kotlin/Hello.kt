package com.github.uuidcode.kotlin

fun main(args: Array<String>) {
    println("Hello, World")
}

class Hello {
    fun test(): String {
        return "Hello, World!"
    }

    fun sum(a: Int, b: Int = 0): Int {
        return a + b;
    }

    fun sum() : Unit {
    }

    fun listOf() {
        var list = listOf("a", "b", "c")

        for (item in list) {
            println(item)
        }
    }
}
