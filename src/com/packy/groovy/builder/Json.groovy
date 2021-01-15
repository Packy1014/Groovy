package com.packy.groovy.builder

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'Groovy'
        author(first: 'Packy', last: 'Ran')
        related 'book1', 'book2'
    }

    nextBook {
        title 'Java'
        author(first: 'Tom', last: 'Jerry')
        related 'book3', 'book4'
    }

}

println builder.toPrettyString()