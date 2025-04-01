fun prac3() {
    print("Введите четырёхзначное число: ")
    val number = readLine()?.trim()
    
    if (number != null && number.length == 4 && number.all { it.isDigit() }) {
        println("Результат:")
        println(number.toCharArray().joinToString(" "))
    } else {
        println("Ошибка ввода: необходимо ввести четырёхзначное число.")
    }
}
