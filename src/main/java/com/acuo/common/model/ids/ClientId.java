package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import org.joda.convert.FromString;

import java.util.Objects;

public class ClientId extends TypedString<ClientId> {

    private ClientId(String name) {
        super(name);
    }

    @FromString
    public static ClientId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new ClientId(id);
    }
}
