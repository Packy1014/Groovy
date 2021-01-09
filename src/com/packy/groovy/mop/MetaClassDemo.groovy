package com.packy.groovy.mop

class Developer {

}

Developer developer = new Developer()
developer.metaClass.name = 'Packy'
developer.metaClass.writeCode = {
    println "$name loves to write code..."
}
developer.writeCode()

String.metaClass.shout={
    toUpperCase()
}
println 'hello world'.shout()