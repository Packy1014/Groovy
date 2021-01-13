package com.packy.groovy.metacompiletime


import groovy.transform.TypeChecked

@TypeChecked
class Human {
    String first
    String last

    String getFullName() {
//        "$first $lastName"
    }
}