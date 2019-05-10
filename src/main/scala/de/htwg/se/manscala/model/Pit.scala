package de.htwg.se.manscala.model

import de.htwg.se.manscala.model.Player

object Pit {
  val PIT_SIZE: Int = 6
}

case class Pit(var stones: Int, isMancala: Boolean, owner: Player) {
  def this(pl: String) = this(Pit.PIT_SIZE, isMancala = false, Player(pl))

  def incr(): Unit = {
    this.stones += 1
  }

  def emptyPit(): Int = {
    val ret = this.stones
    this.stones = 0
    ret
  }

  override def toString:String = this.isMancala match {
    case false => "(" + this.stones + ")"
    case true => "([" + this.stones + "])"
  }
}
