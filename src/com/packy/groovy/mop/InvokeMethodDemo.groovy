package com.packy.groovy.mop

class InvokeMethod {
    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    def test() {
        return 'method exists'
    }
}

def invokeMethod = new InvokeMethod()

println invokeMethod.test() == 'method exists'
println invokeMethod.someMethod() == 'called invokeMethod someMethod []'