package com.acuo.common.ids;

import com.acuo.common.type.TypedString;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.joda.convert.FromString;

import java.util.Objects;

public class TradeId extends TypedString<TradeId> {

    private TradeId(String name) {
        super(name);
    }

    @FromString
    @JsonCreator
    public static TradeId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new TradeId(id);
    }

}
