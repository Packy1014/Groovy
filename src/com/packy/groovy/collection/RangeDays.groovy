package com.packy.groovy.collection

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

for (day in dayRange) {
    print "$day "
}

println ''

dayRange.each {
    day -> print "$day "
}

println ''

println dayRange.size()
println dayRange.contains(Days.FRIDAY)

def wednesday = Days.WEDNESDAY
println Days.THURSDAY == ++wednesday
println Days.WEDNESDAY == --wednesday