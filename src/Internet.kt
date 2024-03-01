interface Internet {
    var priceInternetConnection : Double
    fun GetPriceInternet() {
        println("Цена подключения интернет соединения = $priceInternetConnection")
    }
    fun SetPriceInternet() {
        try {
            print("Введите цену подключения интернета: ")
            var price = readLine()!!.toDouble()
            this.priceInternetConnection = price
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите заново")
            SetPriceInternet()
        }
    }
}