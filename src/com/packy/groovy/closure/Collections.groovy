package com.packy.groovy.closure

List days = ['Sunday', 'Monday', 'Tuesday', 'Saturday']
List weekend = days.findAll { it.startsWith('S') }
println days
println weekend

List nums = [1, 2, 3, 4, 5, 6, 7]
List timesTen = nums.collect {
    num -> num * 10
}
println nums
println timesTen