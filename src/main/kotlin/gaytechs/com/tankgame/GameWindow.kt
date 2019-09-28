package gaytechs.com.tankgame

import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import gaytechs.com.tankgame.model.*
import javafx.scene.input.KeyCode
import java.io.File

class GameWindow: Window("Tank War", "img/Tamako.png", Config.gameWidth, Config.gameHeight) {

    var views = arrayListOf<View>()

    override fun onCreate() {
        // Read from map file to create map
        var mapFile = File(javaClass.getResource("/map/1.map").path)
        var lines:List<String> = mapFile.readLines();

        var rowNum = 0
        lines.forEach{
            // Iterate through each line
            var colNum = 0
            it.toCharArray().forEach{ column ->
                when(column){
                    '#' -> views.add(Wall(colNum*Config.block, rowNum*Config.block))
                    '$' -> views.add(Steel(colNum*Config.block, rowNum*Config.block))
                    '&' -> views.add(Grass(colNum*Config.block, rowNum*Config.block))
                    '%' -> views.add(Water(colNum*Config.block, rowNum*Config.block))
                }
                colNum ++;
            }
            rowNum++
        }

        // Add our Tank
        views.add(Tank(Config.block*10, Config.block*10))
    }

    override fun onDisplay() {
        // Draw the Img

        // Draw a wall
        views.forEach{
            it.draw()
        }
    }

    override fun onKeyPressed(event: KeyEvent) {
        when(event.code){
            //KeyCode.W ->
        }
    }

    override fun onRefresh() {
    }

}