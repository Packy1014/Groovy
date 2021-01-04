package com.packy.groovy.closure

def writer = {
    append 'Packy'
    append 'lives in USA'
}

def append(String s) {
    println "append() called with argument of $s"
}

writer()

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
println sb