package com.packy.groovy.mop

class PropertyDemo {
    def prop1 = 'prop1'
    def prop2 = 'prop2'
    def prop3 = 'prop3'

    def getProperty(String name) {
        println "getProperty() called with argument $name"

        if (metaClass.hasProperty(this, name)) {
            return metaClass.getProperty(this, name)
        } else {
            return 'property can not be found'
        }
    }
}

def propertyDemo = new PropertyDemo()
println propertyDemo.prop1
println propertyDemo.prop2
println propertyDemo.prop3
println propertyDemo.prop4