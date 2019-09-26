import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.scene.paint.Color
import org.itheima.kotlin.game.core.Composer
import org.itheima.kotlin.game.core.Painter
import org.itheima.kotlin.game.core.Window

/**
 * Window object
 * Extends from Game engine
 */
class MyWindow: Window() {
    override fun onCreate() {
        println("Window Created")
    }

    override fun onDisplay() {
        // Call back function for window display
        Painter.drawImage("", 200, 200);

        //
        Painter.drawColor(Color.WHITE, 300,300,3 ,3);
    }

    override fun onKeyPressed(event: KeyEvent) {
        // Keypress Response
        when(event.code){
            KeyCode.ENTER -> println("Enter Pressed")
            KeyCode.L -> Composer.play("");
        }
    }

    override fun onRefresh() {
    }
}

fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}