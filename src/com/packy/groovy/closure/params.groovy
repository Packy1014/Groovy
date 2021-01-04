package com.packy.groovy.closure

def foo = {
    println it
}
foo('Packy')

foo = {
    name -> println name
}
foo('Packy')

def noparams = {
    println 'no params...'
}
noparams(1)

def sayHello = {
    String first, String last -> println "Hello, $first $last"
}
sayHello('Packy', 'Ran')

def greet = {
    String name, String greeting = 'Howdy' -> println "$greeting, $name"
}
greet('Packy', 'Hello')
greet('Packy')

def concat = {
    String... args -> args.join('')
}
println concat('abc', 'def', '123', '456')

def someMethod(Closure c) {
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, String y -> println x }
someMethod(someClosure)