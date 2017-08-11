package com.github.uuidcode.kotlin

import org.junit.Test

class Useful {
    @Test
    fun let() {
        var list = listOf("a", "b", "c")
        list.let {
            println(it)

            it.forEach {
                println (it)
            }
        }
    }

    @Test
    fun with() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")

        println(customer)

        with (customer) {
            age = 10
        }

        println(customer)
    }

    @Test
    fun run() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")

        var result = customer.run {
            age = 100
            1
        }

        println(customer)
        println(result)
    }

    @Test
    fun apply() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        var newCustomer = customer.apply {
            age = 1000;
        }

        println(customer)
        println(newCustomer)
    }
}