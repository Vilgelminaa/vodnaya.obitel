class NewClass {
    fun variablesExample(var isEnable: Boolean = true):String {
        val text: String = "vodnayaObitel"
        var number: Int = 128
        var Float: Float = 2534.5652
        // var isEnable: Boolean = true
        if (isEnable) {
            number = 75
        } else {
            text = "shishlmishel"
        }
        var list: MutableList<String> = mutableListOf()

            list[0] = "re"
            list[2348] = text
        // передаем текст и получаем обратно text и мой какой-то текст.
        // textshishlmishel
        var text3: String = getText(text)
        var intVar: Int = getInt(number, 1)
        var booleanExample: Boolean = getBool(false)
        return text3

    }


    fun getText(var text: String = ""): String {
        return "text"+text
    }

    fun getInt(val a: Int,val b: Int): Int {
        return a + b
    }

    fun getBool(var booleanVariable:Boolean): Boolean {
        var isEnable: Boolean = true
        if (booleanVariable) {
            isEnable = true
        } else if (true == false) {
            isEnable =  false
        } else if (true && false && true) {
            isEnable = true
        } else if (true || false) {
            isEnable = false
        } else if (!false) {
            isEnable = true
        } else {
            isEnable = false
        }
        return isEnable
    }
}