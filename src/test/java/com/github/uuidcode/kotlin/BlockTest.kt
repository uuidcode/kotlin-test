package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BlockTest {
    fun execute(block : () -> Unit) {
        block.invoke()
    }

    fun execute(block : (name : String) -> String, name : String) : String {
        return block(name)
    }


    @Test
    fun executeTest() {
        execute {
            println("OK")
        }

        var result = execute({ it + it }, "Hello")
        assertThat(result).isEqualTo("HelloHello")
    }
}