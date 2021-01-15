package com.packy.groovy.builder

import groovy.json.JsonSlurper

def json = '''
    {
        "books": {
            "currentBook": {
                "title": "Groovy",
                "author": {
                    "first": "Packy",
                    "last": "Ran"
                },
                "related": [
                    "book1",
                    "book2"
                ]
            },
            "nextBook": {
                "title": "Java",
                "author": {
                    "first": "Tom",
                    "last": "Jerry"
                },
                "related": [
                    "book3",
                    "book4"
                ]
            }
        }
    }
'''

def books = new JsonSlurper().parseText(json)

println books.books.nextBook.title
