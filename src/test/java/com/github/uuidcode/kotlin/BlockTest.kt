package com.github.uuidcode.kotlin

import org.junit.Test

class BlockTest {
    fun execute(block : () -> Unit) {
        block.invoke()
    }

    fun execute(block : (name : String) -> String, name : String) {
        println(block(name))
    }


    @Test
    fun executeTest() {
        execute {
            println("OK")
        }

        execute({
            it + it
        }, "hello")
    }
}