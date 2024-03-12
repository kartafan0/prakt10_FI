open class firstPc(processorName: String, processorFrequency: Int, ramSize: Int) : Computer(processorName, processorFrequency, ramSize), Quality {
    override fun quality(): Float {
        return 0.1f * processorFrequency + ramSize
    }
}
