import kotlin.test.assertEquals

fun main(args : Array<String>) {
    var testObj = ToyRobotController()
    testPlaceFunction(testObj)
    testTurnFunction(testObj)
    testMoveFunction(testObj)
    testTableBoundaries(testObj)
    testExamplesFromReadme(testObj)
}

fun testPlaceFunction(testObj: ToyRobotController) {
    assertEquals("0,0,NORTH", testObj.performCommands("PLACE 0,0,NORTH REPORT"))
    assertEquals("1,1,EAST", testObj.performCommands("PLACE 1,1,EAST REPORT"))
    assertEquals("2,2,SOUTH", testObj.performCommands("PLACE 2,2,SOUTH REPORT"))
    assertEquals("3,3,WEST", testObj.performCommands("PLACE 3,3,WEST REPORT"))
    assertEquals("4,4,NORTH", testObj.performCommands("PLACE 4,4,NORTH REPORT"))
}

fun testTurnFunction(testObj: ToyRobotController) {
    assertEquals("0,0,WEST", testObj.performCommands("PLACE 0,0,NORTH LEFT REPORT"))
    assertEquals("0,0,SOUTH", testObj.performCommands("PLACE 0,0,NORTH LEFT LEFT REPORT"))
    assertEquals("0,0,EAST", testObj.performCommands("PLACE 0,0,NORTH LEFT LEFT LEFT REPORT"))
    assertEquals("0,0,NORTH", testObj.performCommands("PLACE 0,0,NORTH LEFT LEFT LEFT LEFT REPORT"))
    assertEquals("0,0,EAST", testObj.performCommands("PLACE 0,0,NORTH RIGHT REPORT"))
    assertEquals("0,0,SOUTH", testObj.performCommands("PLACE 0,0,NORTH RIGHT RIGHT REPORT"))
    assertEquals("0,0,WEST", testObj.performCommands("PLACE 0,0,NORTH RIGHT RIGHT RIGHT REPORT"))
    assertEquals("0,0,NORTH", testObj.performCommands("PLACE 0,0,NORTH RIGHT RIGHT RIGHT RIGHT REPORT"))
}

fun testMoveFunction(testObj: ToyRobotController) {
    assertEquals("0,1,NORTH", testObj.performCommands("PLACE 0,0,NORTH MOVE REPORT"))
    assertEquals("1,0,EAST", testObj.performCommands("PLACE 0,0,EAST MOVE REPORT"))
    assertEquals("4,3,SOUTH", testObj.performCommands("PLACE 4,4,SOUTH MOVE REPORT"))
    assertEquals("3,4,WEST", testObj.performCommands("PLACE 4,4,WEST MOVE REPORT"))
}

fun testTableBoundaries(testObj: ToyRobotController) {
    assertEquals("4,4,NORTH", testObj.performCommands("PLACE 4,4,NORTH MOVE MOVE MOVE REPORT"))
    assertEquals("4,4,EAST", testObj.performCommands("PLACE 4,4,EAST MOVE MOVE MOVE REPORT"))
    assertEquals("0,0,SOUTH", testObj.performCommands("PLACE 0,0,SOUTH MOVE MOVE MOVE REPORT"))
    assertEquals("0,0,WEST", testObj.performCommands("PLACE 0,0,WEST MOVE MOVE MOVE REPORT"))
}

fun testExamplesFromReadme(testObj: ToyRobotController) {
    //Example Input and Output given in Github readme
    assertEquals("0,1,NORTH", testObj.performCommands("PLACE 0,0,NORTH MOVE REPORT"))
    assertEquals("0,0,WEST", testObj.performCommands("PLACE 0,0,NORTH LEFT REPORT"))
    assertEquals("3,3,NORTH", testObj.performCommands("PLACE 1,2,EAST MOVE MOVE LEFT MOVE REPORT"))
}


