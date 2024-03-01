class OperatorRussia : Operator() {
    override var name : String = ""
    override var oneMinutePrice : Double = 0.0
    override var areaCover : Double = 0.0
    override var priceInternetConnection : Double = 0.0
    var city : String = ""
    var P : Boolean = false
    fun SetP() {
            print("Имеется ли наличие оплаты за каждое соединение? : ")
            var answer = readLine()!!.toString()
            if (answer == "Да")
                P = true
            else if (answer == "Нет")
                P = false
            else {
                println("Так Да или Нет?")
                SetP()
            }
    }
    override fun GetQ() {
        if (P == true)
            println("Качество оператора $name Россия = ${(100 * areaCover / oneMinutePrice) * 0.7}")
        else
            println("Качество оператора $name Россия = ${(100 * areaCover / oneMinutePrice) * 1.5}")
    }
    fun GetCity() {
        println("Город расположения: $city")
    }
    fun SetCity()
    {
        print("Введите город расположения оператора: ")
        var city = readLine()!!.toString()
        this.city = city
    }
}