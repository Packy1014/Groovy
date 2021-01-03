package com.packy.groovy.collection

def map = [:]
println map.getClass().getName()

def person = [first: 'Packy', last: 'Ran', email: 'packy@packy.com']
println person
println person.first

person.twitter = '@packy'
println person

def emailKey = 'emailAddress'
def twitter = [username: '@packy', (emailKey): 'packy@packy.com']
println twitter
println twitter.sort()

for (entry in person) {
    println entry
}

for (key in person.keySet()) {
    println "$key:${person[key]}"
}