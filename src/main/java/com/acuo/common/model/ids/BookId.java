package com.acuo.common.model.ids;

import com.acuo.common.type.TypedString;
import org.joda.convert.FromString;

import java.util.Objects;

public class BookId extends TypedString<BookId> {

    private BookId(String name) {
        super(name);
    }

    @FromString
    public static BookId fromString(String id) {
        Objects.requireNonNull(id, "id");
        return new BookId(id);
    }

}
