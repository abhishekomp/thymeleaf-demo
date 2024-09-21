package org.aom.thymeleaf.posts.domain;

import org.aom.thymeleaf.posts.domain.model.PostDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author : abhishek
 * @since : Wed, 2024-Sep-18
 * Created with IntelliJ IDEA
 */
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<PostDto> getAllPosts() throws IOException {
        return postRepository.getAllPosts().stream()
                .map(PostMapper::mapToDto)
                .toList();
    }
}
