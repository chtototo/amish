fun main() {
    var cat = Tamagochi()
    cat.show()
    while (true) {
        var action: String?
        action = readLine()
        when (action) {
            "sleep" -> cat.sleep()
            "feed" -> cat.feed()
            "play" -> cat.play()
            // "wake up" -> cat.wakeUp()
            // "stop eat" -> cat.stopEat()
            // "stop play" -> cat.stopPlay()
        }
    }
}

class Tamagochi {
    var energy: Int = 10
    var safiety: Int = 10
    var funny: Int = 10
    var status: String? = null

    fun show() {
        println("energy: " + energy)
        println("safiety: " + safiety)
        println("funny: " + funny)
        println(" ")
    }

    fun sleep() {
        // if (status == null) {
       // if (status != "tamagochi is sleeping") {
            when {
                this.energy < 9 -> this.energy += 2
                this.energy == 9 -> this.energy++
                this.energy == 10 -> println("я уже выспался")
            }
            if (safiety > 0)
                this.safiety--
            if (funny > 0)
                this.funny--
            this.show()
            status = "tamagochi is sleeping"
            println(status)
      // }else{
      //     println("tamagochi already sleep")
      // }
            // }else if(status == "tamagochi is eating"){
            //     println("tamagochi is eating! run stop eat")
            // }else if(status == "tamagochi is playing") {
            //     println("tamagochi is playing! run stop play")
            // }else if(status == "tamagochi is sleeping") {
            //     println("tamagochi already sleep")
            // }
        //}
    }

    fun feed() {
        //if (status == null) {
       // if (status != "tamagochi is eating") {
            when {
                this.safiety < 9 -> this.safiety += 2
                this.safiety == 9 -> this.safiety++
                this.safiety == 10 -> println("я уже сытый")
            }
            if (funny > 0)
                this.energy--
            if (funny < 10)
                this.funny++
            this.show()
            status = "tamagochi is eating"
            println(status)
       // }else{
       //     println("tamagochi already eat")
       // }
            // }else if(status == "tamagochi is sleeping"){
            //     println("tamagochi is sleeping! run wake up")
            // }else if(status == "tamagochi is playing") {
            //     println("tamagochi is playing! run stop play")
            // }else if(status == "tamagochi is eating") {
            //     println("tamagochi already eat")
            // }
        //}
    }

    fun play() {
      //  if (status == null) {
        //if (status != "tamagochi is playing") {
            when {
                this.funny < 9 -> this.funny += 2
                this.funny == 9 -> this.funny++
                this.funny == 10 -> println("я уже наигрался")
            }
            if (energy > 0)
                this.energy--
            if (safiety > 0)
                this.safiety--
            this.show()
            status = "tamagochi is playing"
            println(status)
       // }else{
       //     println("tamagochi already play")
       // }
            // }else if(status == "tamagochi is sleeping"){
            //     println("tamagochi is sleeping! run wake up")
            // }else if(status == "tamagochi is eating") {
            //     println("tamagochi is eating! run stop eat")
            // }else if(status == "tamagochi is playing") {
            //     println("tamagochi already play")
            // }
       // }
    }

    // fun wakeUp() {
    //     if (status == "tamagochi is sleeping") {
    //         status = null
    //         println("tamagochi woke up")
    //     }else{
    //         println("tamagochi is not sleeping")
    //     }
    // }
//
    // fun stopEat() {
    //     if (status == "tamagochi is eating") {
    //         status = null
    //         println("tamagochi stop eat")
    //     }else{
    //         println("tamagochi is not eating")
    //     }
    // }
//
    // fun stopPlay() {
    //     if (status == "tamagochi is playing") {
    //         status = null
    //         println("tamagochi stop play")
    //     }else{
    //         println("tamagochi is not playing")
    //     }
    // }
}
