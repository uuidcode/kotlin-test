package com.github.uuidcode.kotlin

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) : Point {
        return Point(x + other.x, y + other.y)
    }
}