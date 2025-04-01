fun prac6() {
    print("Введите ваше имя: ")
    val name = readLine()?.trim()
    
    print("Введите ваш возраст: ")
    val age = readLine()?.toIntOrNull()
    
    if (name.isNullOrBlank() || age == null) {
        println("Ошибка ввода.")
    } else {
        println("Привет, $name! Тебе уже $age")
    }
}
