package com.dennis.appbase.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppbaseBackendApplication

fun main(args: Array<String>) {
	runApplication<AppbaseBackendApplication>(*args)
}
