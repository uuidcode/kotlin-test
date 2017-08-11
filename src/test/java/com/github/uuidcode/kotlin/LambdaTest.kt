package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LambdaTest {
    fun test(function : (a : Int, b : String, c : String, d : Boolean) -> Int,
         a : Int,
         b : String,
         c : String,
         d: Boolean) : Int {
        return function.invoke(a, b, c, d)
    }

    fun example(a : Int, b : String, c : String, d : Boolean) : Int{
        return 1;
    }

    @Test
    fun test() {
        var lambdaTest = LambdaTest()
        assertThat(test(lambdaTest::example, 1, "2", "3", true)).isEqualTo(1)
    }
}