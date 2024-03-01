class TVconnection : Internet {
    override var priceInternetConnection : Double = 0.0
    var name : String = ""
    var priceInstallation : Double = 0.0
    var sumChannels : Int = 0
    var description : String = ""
    fun SetInfo() {
        try {
            print("Введите название тарифа ТВ соединения: ")
            var name = readLine()!!.toString()
            this.name = name
            print("Введите стоимость установки тарифа: ")
            var priceInstallation = readLine()!!.toDouble()
            if (priceInstallation >= 0) {
                this.priceInstallation = priceInstallation
                print("Введите колличество каналов: ")
                var sumChannels = readLine()!!.toInt()
                if (sumChannels > 0) {
                    this.sumChannels = sumChannels
                    print("Введите описание тарифа: ")
                    var description = readLine()!!.toString()
                    this.description = description
                }
                else
                {
                    println("Количество каналов не может быть меньше или равно нулю, введите заново")
                    SetInfo()
                }
            }
            else
            {
                println("Стоимость установки не может быть отрицательной, введите заново")
                SetInfo()
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных")
            SetInfo()
        }
    }
    fun GetInfo() {
        println("Название тарифа ИнтернетТв: $name\nСтоимость установки тарифа: $priceInstallation\nКоличество каналов: $sumChannels\nОписание: $description")
    }
}