package com.packy.groovy.metacompiletime

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ['email'])
class Person{
    String first
    String last
    String email
}

Person person = new Person(first: 'Packy', last: 'Ran', email: 'packy@packy.com')
println person