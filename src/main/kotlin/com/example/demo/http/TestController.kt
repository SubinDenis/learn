package com.example.demo.http

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

//@RestController
@RequestMapping("/api")
class TestController(
    val template: KafkaTemplate<String, String>
) {

    @GetMapping("/test")
    fun test() = "test"

    @GetMapping("/kafka/send-message")
    fun send(): String {
        template.send("quickstart", Instant.now().toString())
        return "ok"
    }
}