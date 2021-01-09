package com.packy.groovy.mop

class Manager extends Expando{
    List languages = []

    def methodMissing(String name, args) {
        println "$name() method was called..."

        if (name.startsWith('write')) {
            String language = name.split('write')[1]
            if (languages.contains(language)) {
                def impl = {
                    Object[] theArgs -> println "I like to write code in $language"
                }
                this.metaClass."$name" = impl
                return impl(args)
            }
        }
    }
}

Manager manager = new Manager();
manager.languages << 'Groovy'
manager.languages << 'Java'
println manager.metaClass.metaMethods.size()

manager.writeGroovy()
manager.writeGroovy()
manager.writeGroovy()
println manager.metaClass.metaMethods.size()

manager.writeJava()
manager.writeJava()
println manager.metaClass.metaMethods.size()