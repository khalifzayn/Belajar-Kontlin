class FunctionOverride {

    fun senderEmail(email: String, address: String) {
        println("Email $email")
        println("address $address")
    }

    fun senderEmail(email: String, address: String, job: String) {
        println("Email: $email")
        println("Address: $address")
        println("Job: $job")
    }
}

fun main() {
    val Override = FunctionOverride()

    Override.senderEmail(email = "faisalzero.fz@gmail.com", address = "Medan")
    Override.senderEmail(email = "faisalzero.fz@gmail.com", address = "Medan", job = "Mobile Developer")
}