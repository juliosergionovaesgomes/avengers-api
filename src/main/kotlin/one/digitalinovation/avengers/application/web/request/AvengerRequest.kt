package one.digitalinovation.avengers.application.web.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import one.digitalinovation.avengers.domain.avenger.Avenger
import org.jetbrains.annotations.NotNull

data class AvengerRequest(
    @field: NotNull
    @field: NotBlank
    @field: NotEmpty
    val nick: String,
    @field: NotNull
    @field: NotBlank
    @field: NotEmpty
    val person: String,
    val description: String? = "",
    val history: String? = ""

) {
    fun toAvenger() = Avenger(
        nick = nick,
        person = person,
        description = description,
        history = history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) = Avenger(
            id = id,
            nick = request.nick,
            person = request.person,
            description = request.description,
            history = request.history
        )
    }
}

