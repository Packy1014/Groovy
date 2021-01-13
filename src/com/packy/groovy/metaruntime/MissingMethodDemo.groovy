package com.packy.groovy.metaruntime

class MissingMethod {
    def methodMissing(String name, def args) {
        println "methodMissing called on $name"
        println "with arguments ${args}"
    }
}

MissingMethod missingMethod = new MissingMethod()
missingMethod.someMethod(1, 2, 3)