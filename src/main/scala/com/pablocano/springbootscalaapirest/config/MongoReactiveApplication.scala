package com.pablocano.springbootscalaapirest.config

import com.mongodb.reactivestreams.client.{MongoClient, MongoClients}
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@EnableReactiveMongoRepositories
class MongoReactiveApplication extends AbstractReactiveMongoConfiguration{

  @Bean
  override def reactiveMongoClient(): MongoClient = MongoClients.create()


  override def getDatabaseName: String = "reactive"
}
