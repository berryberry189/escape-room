package com.escape.room.enums;

public enum StoreEnum {
    NEXT_EDITION("넥스트에디션", 1L),
    SECRET_EDITION("비밀의정원", 2L),
    MURDER_PARKER("머더파커", 3L);

    private String title;
    private Long value;

    StoreEnum(String title, Long value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public Long getValue() {
        return value;
    }
}
