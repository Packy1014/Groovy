package com.packy.groovy.metacompiletime

import groovy.transform.Canonical
import groovy.transform.Immutable

@Canonical
@Immutable
class People {
    String first
    String last
    String email
}

People people = new People('Packy', 'Ran', 'packy@packy.com')
println people

people.first = 'Jaeger'