package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HelloKtTest {
    @Test
    fun test() {
        var hello = Hello()
        assertThat(hello.test()).isEqualTo("Hello, World!")
    }
}
