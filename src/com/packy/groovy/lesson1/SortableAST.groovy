package com.packy.groovy.lesson1

import groovy.transform.Sortable
import groovy.transform.ToString

@ToString
@Sortable
class Person {
    String first
    String last
}

def p1 = new Person(first: 'Joe', last: 'Vega')
def p2 = new Person(first: 'Dan', last: 'Vega')

def people = [p1, p2]
println people

def sortedPeople = people.sort(false)
println people
println sortedPeople