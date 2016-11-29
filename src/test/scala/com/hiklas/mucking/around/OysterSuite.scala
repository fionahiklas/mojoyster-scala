package com.hiklas.mucking.around

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.hiklas.mucking.around.Oyster

/**
  */
class OysterSuite extends FunSuite with BeforeAndAfter {

  var oysterInstance:Oyster = null

  before {
    oysterInstance = new Oyster
  }

  test("Make sure that the instance is not null") {
    assert(oysterInstance!=null)
  }


}
