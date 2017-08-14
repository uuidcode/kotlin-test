package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CustomerTest {
    @Test
    fun test() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        println(customer)
    }

    @Test
    fun hello() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        customer hello "Hello"
        assertThat(customer.name).isEqualTo("Hello, uuidcode")
    }
}