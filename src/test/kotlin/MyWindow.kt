import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window
import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

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
    }

    override fun onKeyPressed(event: KeyEvent) {
        // Keypress Response
        when(event.code){
            KeyCode.ENTER -> println("Enter Pressed")
        }
    }

    override fun onRefresh() {
    }
}

fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}