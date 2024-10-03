package com.freepath.user;

public record User(
    Long id,
    String name,
    Gender gender,
    Integer age,
    String imageUrl
) {
}
