package com.datape.datacurator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataCuratorApplication

fun main(args: Array<String>) {
    runApplication<DataCuratorApplication>(*args)
}
