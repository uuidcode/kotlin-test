package com.github.uuidcode.kotlin

import org.junit.Test

class BlockTest {
    fun execute(block : () -> Unit) {
        block.invoke()
    }

    @Test
    fun executeTest() {
        execute {
            println("OK")
        }
    }
}