package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import org.joda.convert.FromString;

import java.util.Objects;

public class MarginStatementId extends TypedString<MarginStatementId> {

    private MarginStatementId(String name) {
        super(name);
    }

    @FromString
    public static MarginStatementId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new MarginStatementId(id);
    }
}
