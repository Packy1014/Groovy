package com.packy.groovy.lesson1

class Developer {
    String firstName
    String lastName
    def languages = []

    void work() {
        println "$firstName $lastName is working with $languages"
    }
}

Developer developer = new Developer()
developer.firstName = 'Packy'
developer.setLastName('Ran')
developer.languages << 'Groovy'
developer.languages << 'Java'
developer.work()