package com.packy.groovy.builder

import groovy.transform.ToString

@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter {
    String title
}

ObjectGraphBuilder builder = new ObjectGraphBuilder()
builder.classNameResolver = 'com.packy.groovy.builder'

def book = builder.book(title: 'Groovy', summary: 'Groovy tutorial') {
    section(title: 'Section 1') {
        chapter(title: 'Chapter 1')
        chapter(title: 'Chapter 2')
        chapter(title: 'Chapter 3')
    }
    section(title: 'Section 2') {
        chapter(title: 'Chapter 4')
        chapter(title: 'Chapter 5')
        chapter(title: 'Chapter 6')
    }
}

println book