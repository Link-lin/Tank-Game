package gaytechs.com.tankgame.model

/**
 * The standard of Viewable items
 */
interface View {
    // Position
    val x:Int
    val y:Int
    // Height and Weight
    val height:Int
    val width:Int

    // Display
    fun draw()
}