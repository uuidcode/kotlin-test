package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PointTest {
    @Test
    fun test() {
        val p1 = Point(10, 20)
        val p2 = Point(30, 40)

        assertThat(p1 + p2).isEqualTo(Point(40, 60))
    }
}
