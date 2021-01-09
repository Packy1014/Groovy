package com.packy.groovy.conditional

List numbers = [1, 2, 3]
while (numbers) {
    numbers.remove(0)
}
println numbers == []

