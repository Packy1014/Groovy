package com.packy.groovy.builder

import groovy.xml.MarkupBuilder

MarkupBuilder builder1 = new MarkupBuilder()

builder1.sports {
    sport(id: 1) {
        name 'BaseBall'
    }
    sport(id: 2) {
        name 'BasketBall'
    }
    sport(id: 3) {
        name 'FootBall'
    }
    sport(id: 4) {
        name 'Hockey'
    }
    sport(id: null) {
        name ''
    }
}

MarkupBuilder builder2 = new MarkupBuilder()
builder2.omitEmptyAttributes = true
builder2.omitNullAttributes = true

builder2.sports {
    sport(id: 1) {
        name 'BaseBall'
    }
    sport(id: 2) {
        name 'BasketBall'
    }
    sport(id: 3) {
        name 'FootBall'
    }
    sport(id: 4) {
        name 'Hockey'
    }
    sport(id: null) {
        name ''
    }
}