package com.packy.groovy.conditional

static def foo() {
    throw new Exception('Foo Exception')
}

List log = []

try {
    foo()
} catch (Exception e) {
    log << e.message
} finally {
    log << 'finally'
}
println log