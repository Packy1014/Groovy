package com.packy.groovy.collection

def nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
println nums
println nums.class.name

nums.push(99) //Add from head
println nums

nums.putAt(0, 77)
nums[1] = 88
println nums

println nums + [10, 11, 12]

nums << 13
println nums

nums.pop() //Remove from head
nums.removeAt(0)
println nums

println nums - 13
println nums - [8, 9]

println nums.getAt(0..3)
println nums[0..3]

nums << [21, 22, 23]
nums << [31, 32]
println nums
println nums.flatten()

nums = [20, 21, 1, 2, 3, 4, 5, 4, 5, 6, 6, 7, 8, 9]
println nums.unique()

nums = [20, 21, 1, 2, 3, 4, 5, 4, 5, 6, 6, 7, 8, 9] as Set
println nums

nums = [20, 21, 1, 2, 3, 4, 5, 4, 5, 6, 6, 7, 8, 9] as SortedSet
println nums