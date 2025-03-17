fun prac4() {
    val totalDays: Int = 2642

    val years: Int = totalDays / 365
    val remainingDays: Int = totalDays % 365
    val weeks: Int = remainingDays / 7
    val days: Int = remainingDays % 7

    println("Лет: $years, недель: $weeks, дней: $days")
}