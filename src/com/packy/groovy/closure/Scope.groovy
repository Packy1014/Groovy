package com.packy.groovy.closure

class ScopeDemo {
    /*
    1. this corresponds to the enclosing class where the closure is defined
    2. owner corresponds to the enclosing Object where the closure is defined, which may be either a class or a closure
    3. delegate corresponds to a third party Object where methods calls or properties are resolved whenever the receiver of the message is not defined
     */
    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo();
demo.outerClosure()