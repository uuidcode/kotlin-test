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


    var sum = {
        x: Int, y: Int -> x + y
    }

    var add : ((Int, Int) -> Int)? = null

    @Test
    fun executeTest() {
        execute {
            println("OK")
        }

        var result = execute({ it + it }, "Hello")
        assertThat(result).isEqualTo("HelloHello")
        assertThat(sum(1, 2)).isEqualTo(3)
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


    @Test
    fun die() {
        var person = Person(10, "uuid", "code")

        var death = person.die {
            it.at = 100
        }

        assertThat(death.from).isEqualTo("old")
        assertThat(death.at).isEqualTo(100)

        var deathFun : Person.(Death) -> Unit = {
            it.at = 1000
        }

        death = person.die(deathFun)

        assertThat(death.from).isEqualTo("old")
        assertThat(death.at).isEqualTo(1000)

        person.deathFun(Death("accident", 3))
    }
}

fun <T : Person> T.die(body : T.(Death) -> Unit) : Death {
    val death = Death("old")

    death.apply {
        body(this)
    }

    return death
}