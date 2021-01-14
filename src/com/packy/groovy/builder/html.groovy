package com.packy.groovy.builder

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id: 1, name: 'Groovy'],
        [id: 2, name: 'Spring Boot']
]

builder.html {
    head {
        title 'About me'
        keywords 'Packy, Ran'
    }
    body {
        h1 'About me'
        p 'This is paragraph'
        section {
            h2 'Courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
                courses.each { course ->
                    tr {
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}