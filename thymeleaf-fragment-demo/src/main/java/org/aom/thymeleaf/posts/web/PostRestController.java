package org.aom.thymeleaf.posts.web;

import org.aom.thymeleaf.posts.domain.PostService;
import org.aom.thymeleaf.posts.domain.model.PostDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author : abhishek
 * @since : Thu, 2024-Sep-19
 * Created with IntelliJ IDEA
 */

@RestController
@RequestMapping("/rest-api/posts")
class PostRestController {

    private final PostService postService;

    PostRestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    List<PostDto> getAllPosts() throws IOException {
        return postService.getAllPosts();
    }

}
