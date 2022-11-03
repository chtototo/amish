fun main() {
    var cat = Tamagochi()
    cat.show()
    while (true) {
        var action: String?
        action = readLine()
        when (action) {
            "sleep" -> cat.sleep()
            "feed" -> cat.feed()
            "wake up" -> cat.wakeUp()
            "stop eat" -> cat.stopEat()
        }
    }
}

class Tamagochi {
    var energy: Int = 10
    var safiety: Int = 10
    var status: String? = null

    fun show() {
        println("energy: " + energy)
        println("safiety: " + safiety)
        println(" ")
    }

    fun sleep() {
        if (status == null) {
            when {
                this.energy < 9 -> this.energy += 2
                this.energy == 9 -> this.energy++
            }
            this.safiety--
            this.show()
            status = "tamagochi is sleeping"
            println(status)
        }else if(status == "tamagochi is eating"){
            println("tamagochi is eating! run stop eat")
        }else if(status == "tamagochi is sleeping"){
            println("tamagochi already sleep")
        }
    }

    fun feed() {
        if (status == null) {
            when {
                this.safiety < 9 -> this.safiety += 2
                this.safiety == 9 -> this.safiety++
            }
            this.energy--
            this.show()
            status = "tamagochi is eating"
            println(status)
        }else if(status == "tamagochi is sleeping"){
            println("tamagochi is sleeping! run wake up")
        }else if(status == "tamagochi is eating") {
            println("tamagochi already eat")
        }
    }

    fun wakeUp() {
        if (status == "tamagochi is sleeping") {
            status = null
            println("tamagochi woke up")
        }else{
            println("tamagochi is not sleeping")
        }
    }

    fun stopEat() {
        if (status == "tamagochi is eating") {
            status = null
            println("tamagochi stop eat")
        }else{
            println("tamagochi is not eating")
        }
    }
}
