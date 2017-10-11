package hello.springbootkotlindemomvn

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Customer(
        val firstName: String,
        val lastName: String,
        @Id @GeneratedValue
        val id: Long = -1) {

    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}
