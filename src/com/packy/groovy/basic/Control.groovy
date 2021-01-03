package com.packy.groovy.basic

String name = 'Packy'
if (name)
    println 'name has a value'

String key = ''
if (key)
    println 'key has a value'

def list1 = [1, 2, 3, 4]
for (num in list1) {
    println num
}

def list2 = [1, 2, 3, 4, 5]
list2.each { println it }