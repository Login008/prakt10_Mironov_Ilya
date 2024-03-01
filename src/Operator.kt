abstract class Operator : Internet {
    abstract var name : String
    abstract var oneMinutePrice : Double
    abstract var areaCover : Double
    open fun GetQ() {
        println("Качество оператора $name = ${100 * areaCover / oneMinutePrice}")
    }
    fun GetOperator() {
        println("Оператор: $name\nСтоимость разговора за одну минуту: $oneMinutePrice\nПлощадь покрытия связи в квадратных км: $areaCover")
    }
    fun SetOperator() {
        try {
            print("Введите название оператора: ")
            var name = readLine()!!.toString()
            this.name = name
            print("Введите стоимость за 1 минуту разговора: ")
            var oneMinutePrice = readLine()!!.toDouble()
            if (oneMinutePrice >= 0) {
                this.oneMinutePrice = oneMinutePrice
                print("Введите площадь покрытия в квадратных км: ")
                var areaCover = readLine()!!.toDouble()
                if (areaCover > 0) {
                    this.areaCover = areaCover
                }
                else
                {
                    println("Площадь покрытия не может быть меньше или равно нулю, введите заново")
                    SetOperator()
                }
            }
            else
            {
                println("Стоимость не может быть меньше нуля, введите заново")
                SetOperator()
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите заново")
            SetOperator()
        }
    }
}