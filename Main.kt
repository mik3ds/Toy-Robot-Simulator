
fun main(args : Array<String>) {
    println("Toy Robot Simulator. Enter Instructions:")
    var userinput = readLine()

    if(userinput == null) {
        println("No input detected")
        return
    }

    var controller = ToyRobotController()
    var outputStr = controller.performCommands(userinput)

    println(outputStr)
}