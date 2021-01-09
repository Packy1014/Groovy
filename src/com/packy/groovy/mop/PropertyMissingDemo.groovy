package com.packy.groovy.mop

class PropertyMissing {
    def propertyMissing(String name) {
        "missing property: $name"
    }
}

println new PropertyMissing().miss