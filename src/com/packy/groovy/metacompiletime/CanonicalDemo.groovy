package com.packy.groovy.metacompiletime

import groovy.transform.Canonical

@Canonical
class Man {
    String first
    String last
    String email
}

Man man = new Man('Packy', 'Ran', 'packy@packy.com')
println man