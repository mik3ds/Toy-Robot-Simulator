class ToyRobotController {

    fun performCommands(userinput: String): String {

        var validUserCommands = userinput.split(" ").toMutableList()
        validUserCommands = validUserCommands.subList(validUserCommands.indexOf("PLACE"), validUserCommands.size)

        var robo = Robot()
        var tempCoordinates = validUserCommands[1].split(",")
        robo.place(tempCoordinates[0].toInt(), tempCoordinates[1].toInt(), tempCoordinates[2])

        validUserCommands.removeAt(0)

        for (i in validUserCommands) {
            when (i) {
                "LEFT" -> robo.left()
                "RIGHT" -> robo.right()
                "MOVE" -> robo.move()
                "PLACE" -> {
                    var temp2 = validUserCommands.get(validUserCommands.indexOf(i) + 1).split(",")
                    robo.place(temp2[0].toInt(), temp2[1].toInt(), temp2[2])
                }
            }
        }
        return if (validUserCommands[validUserCommands.size - 1] == "REPORT") robo.report() else "complete"
    }
}
