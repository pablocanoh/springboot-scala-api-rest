package com.pablocano.springbootscalaapirest.repository

import com.pablocano.springbootscalaapirest.documents.Account
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.{Flux, Mono}

@Repository
trait AccountCrudRepository extends ReactiveCrudRepository[Account, String]{

  def findAllByValue(value: String): Flux[Account]
  def findFirstByOwner(owner: Mono[String]): Mono[Account]

}
