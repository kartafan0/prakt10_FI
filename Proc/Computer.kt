abstract class Computer(val processorName: String, val processorFrequency: Int, val ramSize: Int) {
    abstract fun quality(): Float

    fun displayInfo() {
        println("Навание процессора: $processorName")
        println("Тактовая частота: $processorFrequency MHz")
        println("Размер ОП: $ramSize MB")
    }
}