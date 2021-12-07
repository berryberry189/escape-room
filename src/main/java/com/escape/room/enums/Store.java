package com.escape.room.enums;

public enum Store {
    NEXT_EDITION("넥스트에디션", 1L),
    SECRET_EDITION("비밀의정원", 2L),
    MURDER_PARKER("머더파커", 3L);

    private String title;
    private Long value;

    Store(String title, Long value) {
        this.title = title;
        this.value = value;
    }
}
