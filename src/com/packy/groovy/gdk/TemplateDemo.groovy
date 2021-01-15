package com.packy.groovy.gdk

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File('email-template.txt'))

Map data = [
        firstName   : 'Packy',
        lastName    : 'Ran',
        repositories: [
                [name: 'Java'],
                [name: 'Groovy'],
                [name: 'Go']
        ]
]

println template.make(data)