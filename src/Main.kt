fun main() {

    val a = 10
    val b = 3

    val z = a + b

    println("x და y ჯამი არის $z")
    println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")

    val answer = readLine()!!

    if (answer == "yes") {
        println("start again")
    } else if (answer == "no") {
       println("end")
    }
}