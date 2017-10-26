package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import org.joda.convert.FromString;

import java.util.Objects;

public class AssetId extends TypedString<AssetId> {

    private AssetId(String name) {
        super(name);
    }

    @FromString
    public static AssetId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new AssetId(id);
    }

}