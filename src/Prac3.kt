
fun prac3() {
    print("Введите четырёхзначное число: ")
    val number = readLine()!!

    println("Результат:")
    for (digit in number) {
        print("$digit ")
    }
}