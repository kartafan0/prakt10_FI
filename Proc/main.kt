fun main() {
    println("Процессор:")
    val processorName = readLine()!!
    println("Введите частоту (MHz):")
    val processorFrequency = readLine()!!.toInt()
    println("Введите размер ОП (MB):")
    val ramSize = readLine()!!.toInt()
    println("Введите объем винчестера (GB):")
    val hddSize = readLine()!!.toInt()
    val computer = firstPc(processorName, processorFrequency, ramSize)
    computer.displayInfo()
    println("Q: ${computer.quality()}")
    val secondPc = secondPc(processorName, processorFrequency, ramSize, hddSize)
    secondPc.displayInfo()
    println("Q: ${secondPc.qualityP()}")
}