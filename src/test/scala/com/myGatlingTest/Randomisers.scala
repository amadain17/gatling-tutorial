package com.myGatlingTest

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.UUID.randomUUID

import scala.util.Random

class Randomisers {

  val rnd = new Random()
  val now = LocalDate.now()
  val datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")
  var uuid = randomUUID().toString

  def randomNewUUID(): String = {
    randomUUID().toString
  }

  def randomString(Length: Int): String = {
    rnd.alphanumeric.filter(_.isLetter).take(Length).mkString
  }

  def randomAlphaNumericString(length: Int): String = {
    rnd.alphanumeric.take(length).mkString
  }

  def randomNumber(length: Int): String = {
    rnd.alphanumeric.filter(_.isDigit).take(length).mkString
  }

  def randomPhoneNumber(): String = {
    randomNumber(3) + "-" + randomNumber(3) + "-" + randomNumber(4)
  }

  def randomDate(startDate: LocalDate): String = {
    startDate.minusYears(rnd.nextInt(70)).format(datePattern)
  }

  def randomEmail:String = {
    rnd.alphanumeric.take(20).mkString + "@yahoo.com"
  }

  def getRandomElement[A](seq: Seq[A], random: Random): A =
      seq(random.nextInt(seq.length))

  def randomGender():String  = {
    getRandomElement(Seq("male", "female", "other"), rnd)
  }

}