fun main(args: Array<String>) {

    val rand = java.util.Random()
    val n = 1 + rand.nextInt(100)
    var guess: Int
    var numberOfTries = 0

    println("Коть загадал число от 1 до 100. Отгадай его!\n")

    try {
        do {
            guess = readLine()!!.toInt()
            var x = Math.abs(n - guess)
            numberOfTries++

            when (x) {
                in 1..3 -> println("А-а-а! Обжигает!")
                in 4..7 -> println("Горячо!")
                in 8..15 -> println("Тепло")
                in 16..31 -> println("Прохладно!")
                in 32..63 -> println("Холодно")
                in 64..99 -> println("Космический холод!")

            }

        } while (guess != n)

    } catch (e: NumberFormatException) {
        println("Вводи только циферки!") }

    println("Ура! Аннушка победила отгадала число за $numberOfTries попыток!")
}