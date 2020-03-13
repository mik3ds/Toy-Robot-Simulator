class Robot {

    private var locationX: Int = 0
    private var locationY: Int = 0
    private var direction: String = ""
    private val validDirections = listOf("NORTH", "SOUTH", "EAST", "WEST")

    fun place(X: Int, Y: Int, F: String) {
        if(X in 0..4 && Y in 0..4 && F in validDirections) {
            locationX = X
            locationY = Y
            direction = F
        }
    }
    fun move() {
        when(direction){
            "NORTH" -> if(locationY<=3) {locationY += 1}
            "EAST" -> if(locationX<=3) {locationX += 1}
            "SOUTH" -> if(locationY>=1) {locationY -= 1}
            "WEST" -> if(locationX>=1) {locationX -= 1}
        }
    }
    fun left() {
        when(direction){
            "NORTH" -> direction = "WEST"
            "EAST" -> direction = "NORTH"
            "SOUTH" -> direction = "EAST"
            "WEST" -> direction = "SOUTH"
        }
    }
    fun right() {
        when(direction){
            "NORTH" -> direction = "EAST"
            "EAST" -> direction = "SOUTH"
            "SOUTH" -> direction = "WEST"
            "WEST" -> direction = "NORTH"
        }
    }

    fun report(): String {
        return "$locationX,$locationY,$direction"
    }
}