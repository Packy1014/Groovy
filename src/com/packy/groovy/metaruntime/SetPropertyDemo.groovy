package com.packy.groovy.metaruntime

class SetProperty {
    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'overridden'
    }
}

def setProperty = new SetProperty()
setProperty.property = 'a'

println setProperty.property