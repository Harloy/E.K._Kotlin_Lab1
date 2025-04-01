fun prac5() {
    print("Введите число: ")
    val input = readLine()?.toIntOrNull()
    
    if (input != null) {
        val result = "$input${input * 2}${input * 3}".toInt()
        println("Результат: $result")
    } else {
        println("Ошибка: введите корректное число.")
    }
}
