package com.github.uuidcode.kotlin

import org.junit.Test

class CustomerTest {
    @Test
    fun test() {
        var customer = Customer("uuidcode", "uuidcode@gmail.com")
        println(customer)
    }
}