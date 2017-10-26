package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.convert.FromString;

import java.util.Objects;

public class PortfolioId extends TypedString<PortfolioId> {

    public PortfolioId(String name) {
        super(name);
    }

    @FromString
    @JsonCreator
    public static PortfolioId fromString(@JsonProperty("name") String id) {
        Objects.requireNonNull(id, "id");
        return new PortfolioId(id);
    }

}
