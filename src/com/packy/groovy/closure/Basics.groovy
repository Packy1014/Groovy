package com.packy.groovy.closure

def c = {}
println c.class.name
println c instanceof Closure

def sayHello = {
    name -> println "Hello, $name"
}
sayHello('Packy')

List nums = [1, 4, 7, 4, 30, 2]
nums.each({
    num -> print "$num "
})
println ''
nums.each {
    num -> print "$num "
}

println ''

static def timesTen(num, closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(10) {
    println it
}