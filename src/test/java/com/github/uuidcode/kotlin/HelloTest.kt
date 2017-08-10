package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HelloTest {
    @Test
    fun test() {
        var hello = Hello()
        assertThat(hello.test()).isEqualTo("Hello, World!")

        assertThat(hello.sum(1)).isEqualTo(1)
        assertThat(hello.sum(1, 2)).isEqualTo(3)
    }

    @Test
    fun interpolate() {
        var message = "Hello, World!"
        var formatMessage = "${message}"
        assertThat(formatMessage).isEqualTo(message)
    }

    @Test
    fun listOf() {
        var hello = Hello()
        hello.listOf()
    }

    @Test
    fun lambda() {
        var list = listOf("abc", "bcd", "afg")

        list.filter {
            it.startsWith("a")
        }.map {
            it.toUpperCase()
        }.forEach {
            println(it)
        }
    }

    @Test
    fun mapOf() {
        var map = mapOf("a" to 1, "b" to 2, "c" to 3)
        println(map)
    }

    @Test
    fun stringLiteral() {
        val text = """
            a
            b
            c
        """

        println(text)
    }
}
