package com.packy.groovy.metacompiletime

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Student {
    String first
    String last
    String email
}

Student student1 = new Student(first: 'Packy', last: 'Ran', email: 'packy@packy.com')
Student student2 = new Student(first: 'Packy', last: 'Ran', email: 'packy@packy.com')
println student1 == student2