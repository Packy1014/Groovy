package com.packy.groovy.basic

@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.11')
)

import org.apache.commons.lang3.text.WordUtils

String name = "Packy Ran"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)