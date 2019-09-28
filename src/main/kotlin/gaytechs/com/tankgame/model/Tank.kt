package gaytechs.com.tankgame.model

import gaytechs.com.tankgame.Config
import org.itheima.kotlin.game.core.Painter

/**
 * User Tank
 */
class Tank(override var x: Int, override var y: Int) :View {
    override val height: Int = Config.block
    override val width: Int = Config.block

    var speed: Int = 8
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

    /**
     * Movement
     */
    fun move(direction: Direction){

        this.currentDir = direction
        if(this.currentDir != direction) return
        // Update the position
        when(currentDir){
            Direction.UP-> {y -= speed }
            Direction.DOWN-> {y += speed}
            Direction.LEFT-> {x -= speed}
            Direction.RIGHT-> {x += speed}
        }

        // Boundary test
        if(x < 0) x = 0
        if(x > Config.gameWidth - width) x = Config.gameWidth -width
        if(y < 0) y = 0
        if(y > Config.gameHeight-height) y = Config.gameHeight - height
    }

}