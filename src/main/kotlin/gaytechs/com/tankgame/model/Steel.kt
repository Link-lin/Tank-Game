package gaytechs.com.tankgame.model

import gaytechs.com.tankgame.Config
import org.itheima.kotlin.game.core.Painter

class Steel(override val x: Int, override val y: Int) :View {
    override val height:Int = Config.block
    override val width:Int = Config.block

    override fun draw() {
        Painter.drawImage("img/steels.gif", x, y)
    }

}