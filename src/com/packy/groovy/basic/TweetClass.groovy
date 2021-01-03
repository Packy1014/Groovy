package com.packy.groovy.basic

import groovy.transform.ToString

@ToString
class Tweet {
    String userName
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    public Tweet(String user, String tweet) {
        userName = user
        text = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    void addToRetweets() {
        retweets++
    }

    void addToFavorites() {
        favorites++
    }
}

def tweet = new Tweet('packy', 'Hello')
tweet.addToFavorites()
println tweet