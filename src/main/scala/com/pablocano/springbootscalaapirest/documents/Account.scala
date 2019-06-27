package com.pablocano.springbootscalaapirest.documents

import org.springframework.data.mongodb.core.mapping.Document

@Document
case class Account(
                  id: String,
                  owner: String,
                  value: Double
                  ) {

}
