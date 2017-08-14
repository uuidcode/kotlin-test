package com.github.uuidcode.kotlin

data class Customer(var name: String, val email: String, var age: Int = 20) {
    infix fun hello(newName : String) {
        this.name = "${newName}, ${name}"
    }
}