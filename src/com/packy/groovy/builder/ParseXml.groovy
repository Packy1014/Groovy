package com.packy.groovy.builder

import groovy.xml.XmlSlurper

def xml = '''
    <sports>
        <sport>
            <name>Football</name>
        </sport>
        <sport>
            <name>Baseball</name>
        </sport>
    </sports>
'''

def sports = new XmlSlurper().parseText(xml)

println sports.sport[1].name