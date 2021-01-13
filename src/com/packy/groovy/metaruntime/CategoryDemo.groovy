package com.packy.groovy.metaruntime

import groovy.time.TimeCategory

class StringCategory {
    static String shout(String str) {
        str.toUpperCase()
    }
}

use(StringCategory) {
    println 'hello world'.shout()
}

//ERROR
//println 'hello world'.shout()

use(TimeCategory) {
    println 1.minute.from.now
    println 10.hours.ago

    def date = new Date()
    println date - 3.months
}