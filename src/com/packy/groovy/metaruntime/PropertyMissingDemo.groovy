package com.packy.groovy.metaruntime

class PropertyMissing {
    def propertyMissing(String name) {
        "missing property: $name"
    }
}

println new PropertyMissing().miss