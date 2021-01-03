package com.packy.groovy.datatype

println 5.0d - 4.1d
println 5.0 - 4.1

println 1 / 2
println 1.intdiv(2)

println 2 == 2.5.toInteger()
println 2 == 2.5 as Integer
println 2 == (int) 2.5

println '5.50'.isNumber()
println 5 == '5'.toInteger()

20.times {
    print it + ' '
}

println ''

1.upto(10) {
    num -> print num + ' '
}

println ''

10.downto(1) {
    num -> print num + ' '
}

println ''

0.step(1, 0.1) {
    num -> print num + ' '
}