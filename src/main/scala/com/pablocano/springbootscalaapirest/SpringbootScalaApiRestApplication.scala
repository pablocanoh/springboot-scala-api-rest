package com.pablocano.springbootscalaapirest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}

object SpringbootScalaApiRestApplication extends App {
  SpringApplication.run(classOf[SpringbootScalaApiRestApplication])
}

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class SpringbootScalaApiRestApplication