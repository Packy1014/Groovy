package com.packy.groovy.datatype

String name = 'Packy'

String msg1 = "Hello ${name}"
println msg1

String msg2 = 'Hello ${name}'
println msg2

String msg3 = "Hello ${1 + 1}"
println msg3

def msg4 = '''
A
message
here ${1+1}
'''
println msg4

def msg5 = """
A
message
here ${1 + 1}
"""
println msg5

def folder = $/C:\groovy\packy\strings/$
println folder