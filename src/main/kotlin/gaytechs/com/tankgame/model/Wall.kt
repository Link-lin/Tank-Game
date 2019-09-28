package gaytechs.com.tankgame.model

import gaytechs.com.tankgame.Config
import org.itheima.kotlin.game.core.Painter
/**
 * Normal Wall
 */
class Wall(override val x: Int, override val y: Int):View {

    // Height and Width
    override var width:Int = Config.block
    override var height:Int = Config.block
    // Display

    override fun draw(){
        Painter.drawImage("img/walls.gif", x, y)
    }



}