package org.aom.thymeleaf.posts.domain;

import org.aom.thymeleaf.posts.domain.model.PostDto;

/**
 * @author : abhishek
 * @since : Wed, 2024-Sep-18
 * Created with IntelliJ IDEA
 */
class PostMapper {

    static PostDto mapToDto(Post post){
        return new PostDto(
                post.getId(),
                post.getUserId(),
                post.getTitle(),
                post.getDateAdded()
        );
    }

}
