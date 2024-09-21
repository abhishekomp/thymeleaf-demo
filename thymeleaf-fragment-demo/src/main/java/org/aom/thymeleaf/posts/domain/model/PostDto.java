package org.aom.thymeleaf.posts.domain.model;

import java.time.LocalDate;

/**
 * @author : abhishek
 * @since : Wed, 2024-Sep-18
 * Created with IntelliJ IDEA
 */
public record PostDto(Integer id, String userId, String title, LocalDate dateAdded) {
}
