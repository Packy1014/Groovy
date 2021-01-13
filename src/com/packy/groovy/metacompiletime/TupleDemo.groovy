package com.packy.groovy.metacompiletime

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@ToString
class Teacher {
    String first
    String last
    String email
}

Teacher teacher = new Teacher('Packy', 'Ran', 'packy@packy.com')
println teacher