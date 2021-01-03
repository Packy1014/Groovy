package com.packy.groovy.datatype

def a = 1
def b = 2
println a + b
println a.plus(b)

def s1 = 'Hello'
def s2 = ', world!'
println s1 + s2
println s1.plus(s2)

class Account {
    BigDecimal balance

    Account plus(Account other) {
        new Account(balance: this.balance + other.balance)
    }

    String toString() {
        "Account Balance: $balance"
    }
}

Account saving = new Account(balance: 100.00)
Account checking = new Account(balance: 500.00)
println saving + checking