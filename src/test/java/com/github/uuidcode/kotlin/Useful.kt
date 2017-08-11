package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
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

        assertThat(newCustomer.name).isEqualTo(customer.name)
        assertThat(newCustomer.email).isEqualTo(customer.email)
        assertThat(newCustomer.age).isEqualTo(2000)
    }

    @Test
    fun destructing() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        var (name, email, age) = customer

        assertThat(name).isEqualTo(customer.name)
        assertThat(email).isEqualTo(customer.email)
        assertThat(age).isEqualTo(customer.age)
    }

    @Test
    fun componentN() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        assertThat(customer.component1()).isEqualTo(customer.name)
        assertThat(customer.component2()).isEqualTo(customer.email)
        assertThat(customer.component3()).isEqualTo(customer.age)
    }
}