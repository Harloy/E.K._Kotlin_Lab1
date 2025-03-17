fun prac6() {
    print("Введите ваше имя: ")
    val name = readLine()!!

    print("Введите ваш возраст: ")
    val age = readLine()!!.toInt()

    println("Привет, $name! Тебе уже $age")
}