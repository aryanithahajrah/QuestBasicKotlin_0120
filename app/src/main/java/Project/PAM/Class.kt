package Project.PAM

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "marry@gmail.com")

    // Prints nilai properti: email
    println(contact.email)

    //Updates nilai properti: email
    contact.email = "jane@gmail.com"

    // Prints nilai baru properti: emai
    println(contact.email)
}