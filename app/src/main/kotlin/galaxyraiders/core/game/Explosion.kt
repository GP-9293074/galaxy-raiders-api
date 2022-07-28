package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

private const val EXPLOSIONFRAMES: Int = 48

class Explosion(
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double
) :
  SpaceObject("Explosion", 'x', initialPosition, initialVelocity, radius, mass) {
  private var frameCnt = EXPLOSIONFRAMES
  override fun move() {
    if (this.frameCnt > 0) {
      this.frameCnt--
    } else {
      this.radius = 0.0
    }
  }
}
