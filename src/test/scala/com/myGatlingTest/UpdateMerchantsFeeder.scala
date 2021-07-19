package com.myGatlingTest

import java.time.LocalDate

object UpdateMerchantsFeeder {
  var randomisers = new Randomisers()

  val updateMerchants = Iterator.continually(Map(
  "id" -> randomisers.randomNewUUID(),
  "email" -> randomisers.randomEmail(),
  "phoneNumber" -> randomisers.randomPhoneNumber(),
  "storeName" -> (randomisers.randomString(7) + " Ltd"),
  "firstName" -> randomisers.randomString(4),
  "lastName" -> randomisers.randomString(6),
  "dob" -> randomisers.randomDate(LocalDate.now()),
  "gender" -> randomisers.randomGender(),
  "nationalIdNumber" -> randomisers.randomAlphaNumericString(8),
  "businessAddress" -> (randomisers.randomNumber(5) + " Jumbotail, Pune")
  ))
}
