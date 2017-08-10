package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class HelloSpek : Spek({
    describe("a calculator") {
        val hello = Hello()

        on("test") {
            Assertions.assertThat(hello.test()).isEqualTo("Hello, World!")
        }
    }
})
