package me.project.memento

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders
import org.springframework.restdocs.operation.preprocess.Preprocessors.*
import org.springframework.restdocs.payload.JsonFieldType
import org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath
import org.springframework.restdocs.payload.PayloadDocumentation.responseFields
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class HealthCheckTestApi: AbstractTest() {

    @Test
    @DisplayName("현재 동작하고 있는 jvm의 system current milliseconds 를 출력한다.")
    fun currentJvmMilliseconds() {
        val result = mockMvc.perform(RestDocumentationRequestBuilders.get("/api/curr/mills"))

        result.andExpect(status().isOk)
            .andDo(document("{class-name}/{method-name}",
                getDocumentRequest(),
                preprocessResponse(prettyPrint()),
                responseFields(
                    fieldWithPath("currentMilliseconds").type(JsonFieldType.NUMBER).description("JVM 시스템 현재 밀리초")
                )
            ))
    }
}