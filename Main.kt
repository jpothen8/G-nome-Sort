@file:JvmName("Main")

import kotlin.random.Random
fun main() {
        val testArray = IntArray(10000) { Random.nextInt(1, 1001) }

        println("Original List: " + testArray.contentToString())

        GnomeSort().sort(testArray)

        println("Sorted List: " + testArray.contentToString())

        println("                                                                   \n" +
                " ,adPPYb,d8 8b,dPPYba,   ,adPPYba,  88,dPYba,,adPYba,   ,adPPYba,  \n" +
                "a8\"    `Y88 88P'   `\"8a a8\"     \"8a 88P'   \"88\"    \"8a a8P_____88  \n" +
                "8b       88 88       88 8b       d8 88      88      88 8PP\"\"\"\"\"\"\"  \n" +
                "\"8a,   ,d88 88       88 \"8a,   ,a8\" 88      88      88 \"8b,   ,aa  \n" +
                " `\"YbbdP\"Y8 88       88  `\"YbbdP\"'  88      88      88  `\"Ybbd8\"'  \n" +
                " aa,    ,88                                                        \n" +
                "  \"Y8bbdP\"")
}