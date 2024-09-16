package com.example.demo.kafka

import mu.KotlinLogging
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

//@Configuration
class ProducerConf {

    @Bean
    fun producerFactory(
        @Value("\${app.kafka.bootstrap-servers}") bootstrapServers: String
    ): ProducerFactory<String, String> {
        log.debug { "[CONFIG] Building ProducerFactory..." }
        val props = mutableMapOf<String, Any>().apply {
            put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers)
            put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java)
            put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer::class.java)
        }
        return DefaultKafkaProducerFactory(props)
    }

    @Bean
    fun kafkaTemplate(
        producerFactory: ProducerFactory<String, String>
    ): KafkaTemplate<String, String> {
        log.debug { "[CONFIG] Building KafkaTemplate..." }
        return KafkaTemplate(producerFactory)
    }

    companion object {
        private val log = KotlinLogging.logger {}
    }

}