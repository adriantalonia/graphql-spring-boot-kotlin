package com.graph.example.query

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class PostResolver {

    @QueryMapping
    fun getPosts(): List<PostDto> {
        return listOf(
            PostDto(
                UUID.randomUUID(),
                "title test",
                "description test"
            )
        )
    }
}

data class PostDto(
    val id: UUID,
    val title: String,
    val description: String
)