package com.packy.groovy.closure

def log = {
    String type, Date createdOn, String msg -> println "$createdOn [$type] - $msg"
}
log('DEBUG', new Date(), 'This is first debug statement...')

def debugLog = log.curry('DEBUG')
debugLog(new Date(), 'This is second debug statement...')

def todayDebugLog = debugLog.curry(new Date())
todayDebugLog('This is third debug statement...')

def errorLog = log.rcurry('This is fourth debug statement...')
errorLog('ERROR', new Date())

def typeLog = log.ncurry(1, new Date())
typeLog('WARNING', 'This is fifth debug statement...')