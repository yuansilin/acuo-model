package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import org.joda.convert.FromString;

import java.util.Objects;

public class TradeId extends TypedString<TradeId> {

    private TradeId(String name) {
        super(name);
    }

    @FromString
    public static TradeId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new TradeId(id);
    }

}
