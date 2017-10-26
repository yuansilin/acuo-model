package com.acuo.common.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.ObjectMapper
import org.joda.convert.FromString
import spock.lang.Specification

class TypedStringSpec extends Specification {

    def "can serialize a typed string using object mapper"() {
        given:
        ObjectMapper mapper = new ObjectMapper()
        Dummy dummy = Dummy.fromString("dummy")

        expect:
        mapper.writeValueAsString(dummy) == "\"dummy\""
    }

    def "can deserialize a typed string using object mapper"() {
        given:
        ObjectMapper mapper = new ObjectMapper()
        def value = mapper.readValue("\"dummy\"", Dummy)

        expect:
        value != null
        value == Dummy.fromString("dummy")
    }

    static class Dummy extends TypedString<Dummy> {

        private Dummy(String name) {
            super(name)
        }

        @FromString
        @JsonCreator
        static Dummy fromString(String id) {
            Objects.requireNonNull(id, "id")
            return new Dummy(id)
        }
    }

}
