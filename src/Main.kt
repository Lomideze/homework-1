fun main() {

    val a = Integer.valueOf(readLine())
    val b = Integer.valueOf(readLine())

    val z = a + b

    println("x და y ჯამი არის $z")
    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")

    val answer = readLine()!!

    if (answer == "yes") {

        return main()

    } else if (answer == "no") {

        println("end")

    }
}