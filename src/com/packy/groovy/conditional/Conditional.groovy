package com.packy.groovy.conditional

def num = 12

switch (num) {
    case 1:
        println '1'
        break
    case 1..3:
        println 'in range 1..3'
        break
    case [1, 2, 13]:
        println 'num is in list[1,2,3]'
        break
    case Integer:
        println 'num is an Integer'
        break
    default:
        println 'default'
}

def validAges = 18..35
def age = 19
println age in validAges