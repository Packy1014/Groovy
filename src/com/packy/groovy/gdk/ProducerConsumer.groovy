package com.packy.groovy.gdk

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue queue = [] as LinkedBlockingQueue

Thread.start('Push') {
    10.times {
        println "${Thread.currentThread().name} : ${it}"
        queue << it
        sleep 500
    }
}

Thread.start('Pop') {
    for (i in 0..9) {
        println "${Thread.currentThread().name} ${queue.take()}"
    }
}