fun main() {
    var cat = Tamagochi()
    cat.show()
    while (true) {
        var action: String?
        action = readLine()
        when (action) {
            "sleep" -> cat.sleep()
            "feed" -> cat.feed()
        }
    }
}

class Tamagochi {
    var energy: Int = 10
    var safiety: Int = 10

    fun show() {
        println("energy: " + energy)
        println("safiety: " + safiety)
        println(" ")
    }

    fun sleep() {
        when {
            this.energy < 9 -> this.energy += 2
            this.energy == 9 -> this.energy++
        }
        this.safiety--
        this.show()
    }

    fun feed() {
        when {
            this.safiety < 9 -> this.safiety += 2
            this.safiety == 9 -> this.safiety++
        }
        this.energy--
        this.show()
    }
}

