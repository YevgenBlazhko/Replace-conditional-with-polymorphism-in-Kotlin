package com.app.replaceconditionalwithpolymorphism

abstract class Bird {
  abstract fun getSpeed(isNailed: Boolean = false): Double
  abstract fun getColor(): BirdColor
}

object Dove : Bird() {
  override fun getSpeed(isNailed: Boolean): Double {
    return 148.9
  }

  override fun getColor(): BirdColor {
    return BirdColor.GREY
  }
}

object Eagle : Bird() {
  override fun getSpeed(isNailed: Boolean): Double {
    return 139.0
  }

  override fun getColor(): BirdColor {
    return BirdColor.BROWN
  }
}

object Falcon : Bird() {
  override fun getSpeed(isNailed: Boolean): Double {
    return 90.0
  }

  override fun getColor(): BirdColor {
    return BirdColor.BLUE
  }
}

enum class BirdColor {
  BROWN,
  BLUE,
  GREY
}