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

    @Test
    fun functionLiteralsWithReciver() {
        var greetString: String.(String) -> Unit = {
            println("Hello $this $it")
        }

        var greetInt: Int.() -> Unit = {
            println("Hello $this")
        }

        "abc".greetString("!!")
        1.greetInt()
    }

}