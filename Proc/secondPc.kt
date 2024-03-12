open class secondPc(processorName: String, processorFrequency: Int, ramSize: Int, val hddSize: Int) : firstPc(processorName, processorFrequency, ramSize) {
    fun qualityP(): Float {
        return quality() + 0.5f * hddSize
    }
}
