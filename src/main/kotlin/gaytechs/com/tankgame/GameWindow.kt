package gaytechs.com.tankgame

import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import gaytechs.com.tankgame.model.*
import javafx.scene.input.KeyCode
import java.awt.Event
import java.io.File

class GameWindow : Window("Tank War", "img/Tamako.png", Config.gameWidth, Config.gameHeight) {

    // Collection of all the views
    private var views = arrayListOf<View>()

    private lateinit var tank: Tank

    private var keyPressing: Boolean = false

    override fun onCreate() {
        // Read from map file to create map
        var mapFile = File(javaClass.getResource("/map/1.map").path)
        var lines: List<String> = mapFile.readLines();

        var rowNum = 0
        lines.forEach {
            // Iterate through each line
            var colNum = 0
            it.toCharArray().forEach { column ->
                when (column) {
                    '#' -> views.add(Wall(colNum * Config.block, rowNum * Config.block))
                    '$' -> views.add(Steel(colNum * Config.block, rowNum * Config.block))
                    '&' -> views.add(Grass(colNum * Config.block, rowNum * Config.block))
                    '%' -> views.add(Water(colNum * Config.block, rowNum * Config.block))
                }
                colNum++;
            }
            rowNum++
        }

        // Add our Tank
        tank = Tank(Config.block * 10, Config.block * 10)
        views.add(tank)
    }

    override fun onDisplay() {
        // Draw the Img

        // Draw a wall
        views.forEach {
            it.draw()
        }
    }

    override fun onKeyPressed(event: KeyEvent) {

//        print(event.eventType)
//        println(keyPressing)
//        // When no key is pressing
//        if(event.eventType == KeyEvent.KEY_PRESSED && !keyPressing){
//            keyPressing = true;
//        }
//
//        // When we released a key and that key was pressed
//        if(event.eventType == KeyEvent.KEY_RELEASED && keyPressing){
//            println("!!!!!!!!!!!!!!!!!");
//            keyPressing = !keyPressing
//        }

        when (event.code) {
            KeyCode.W -> {
                tank.move(Direction.UP)
            }
            KeyCode.A -> {
                tank.move(Direction.LEFT)
            }
            KeyCode.S -> {
                tank.move(Direction.DOWN)
            }
            KeyCode.D -> {
                tank.move(Direction.RIGHT)
            }
        }


    }

    override fun onRefresh() {
    }

}