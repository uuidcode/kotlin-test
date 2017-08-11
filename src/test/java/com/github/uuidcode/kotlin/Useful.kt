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

    @Test
    fun copy() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        var newCustomer = customer.copy(age = 2000)

        println(customer)
        println(newCustomer)
    }

    @Test
    fun destructing() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        var (name, email, age) = customer

        println(name)
        println(email)
        println(age)
    }

    @Test
    fun componentN() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        println(customer.component1())
        println(customer.component2())
        println(customer.component3())
    }
}