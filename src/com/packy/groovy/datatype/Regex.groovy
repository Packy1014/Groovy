package com.packy.groovy.datatype

def pattern = ~/.*abc.*/
def text = 'aaabcccc'
def finder = text =~ pattern
def matcher = text ==~ pattern
println finder
println finder.size()
println matcher
