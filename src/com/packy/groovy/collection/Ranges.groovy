package com.packy.groovy.collection

Range r1 = 1..10
println r1
println r1.class.name
println r1.from
println r1.to
println r1.contains(2)

Range r2 = 1..<10
println r2.to

Date today = new Date()
Date oneWeekAway = today + 7
println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
println letters