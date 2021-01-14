package com.packy.groovy.metacompiletime

import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
@ToString(includeNames = true)
class Developer {
    String firstName
    String lastName
    String email
    Date hireDate
    List languages
}

Developer developer = Developer.builder()
        .firstName('Packy')
        .lastName('Ran')
        .email('packy@pakcy.com')
        .hireDate(new Date())
        .languages(['Java', 'Groovy'])
        .build()

println developer