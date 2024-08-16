class ThisKeyword(
    private val email: String
) {

    fun senderEmail(email: String) {
        println("Data untuk $email dan ${this.email} dikirim")
    }
}

fun main() {
    val keyword = ThisKeyword(email = "faisalzero.fz@gmail.com")
    keyword.senderEmail(email = "faisalzuhri@outlook.com")
}