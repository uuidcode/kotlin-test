package com.github.uuidcode.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ProjectTest {
    @Test
    fun constructor1() {
        var project = Project(name = "Hello")

        assertThat(project.id).isNull()
        assertThat(project.name).isEqualTo("Hello")
    }

    @Test
    fun constructor2() {
        var project = Project()

        project.apply {
            id = 100
            name = "Hello"
        }

        assertThat(project.id).isEqualTo(100)
        assertThat(project.name).isEqualTo("Hello")
    }
}