package com.packy.groovy.metacompiletime

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

//This will let the Groovy compiler use compile time checks in the style of Java then perform static compilation,
//thus bypassing the Groovy meta Object protocol
@CompileStatic
class Car {
    String foo() {
        'foo'
    }

    String bar() {
        'bar'
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void test() {

    }
}