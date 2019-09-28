package gaytechs.com.tankgame.model

import gaytechs.com.tankgame.Config
import org.itheima.kotlin.game.core.Painter

/**
 * User Tank
 */
class Tank(override val x: Int, override val y: Int) :View {
    override val height: Int = Config.block
    override val width: Int = Config.block

    //Direction
    var currentDir:Direction = Direction.UP

    override fun draw() {
        var imgPath:String = when(currentDir){
            Direction.UP -> "img/p1TankU.gif"
            Direction.DOWN-> "img/p1TankD.gif"
            Direction.LEFT-> "img/p1TankL.gif"
            Direction.RIGHT-> "img/p1TankR.gif"
        }
        Painter.drawImage(imgPath, x, y)
    }

}