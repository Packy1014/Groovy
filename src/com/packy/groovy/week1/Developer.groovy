package com.packy.groovy.week1

class Developer {
    String firstName
    String lastName
    def languages = []

    void work() {
        println "$firstName $lastName is working with $languages"
    }
}