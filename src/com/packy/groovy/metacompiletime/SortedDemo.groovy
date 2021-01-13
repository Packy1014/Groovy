package com.packy.groovy.metacompiletime

import groovy.transform.Canonical
import groovy.transform.Sortable

@Canonical
@Sortable(includes = ['last', 'first'])
class Woman {
    String first
    String last
    String email
}

Woman woman1 = new Woman('Packy', 'Ran', 'packy@packy.com')
Woman woman2 = new Woman('Jaeger', 'Wen', 'packy@packy.com')
Woman woman3 = new Woman('Jerry', 'Hao', 'packy@packy.com')
Woman woman4 = new Woman('Tom', 'Ran', 'packy@packy.com')

def list = [woman1, woman2, woman3, woman4]
println list.toSorted()