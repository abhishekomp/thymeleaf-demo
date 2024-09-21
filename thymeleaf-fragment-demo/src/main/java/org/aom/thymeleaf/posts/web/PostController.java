package org.aom.thymeleaf.posts.web;

import org.aom.thymeleaf.posts.domain.PostService;
import org.aom.thymeleaf.posts.domain.model.PostDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * @author : abhishek
 * @since : Wed, 2024-Sep-18
 * Created with IntelliJ IDEA
 */
@Controller
//@RequestMapping("/api/posts")
class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;
    PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/allPosts")
    @ResponseBody
    List<PostDto> getAllPosts() throws IOException {
        return postService.getAllPosts();
    }

    @GetMapping
    String getPosts() {
        //return "redirect:/showData";
        log.info("Redirecting to /posts endpoint");
        return "redirect:/posts";
    }

    @GetMapping("/posts")
    String getAllPosts(Model model) throws IOException {
        List<PostDto> allPosts = postService.getAllPosts();
        model.addAttribute("posts", allPosts);
        return "index";
    }

    @GetMapping("/features")
    String getFeatures(Model model) throws IOException {
        return "features";
    }

    @GetMapping("/pricing")
    String getPricing(Model model) throws IOException {
        return "pricing";
    }

    @GetMapping("/posts/{postId}")
    String getPost(Model model, @PathVariable String postId) throws IOException {
        // call service to get the postDto object and then add it to the model
        //PostDto = postService.getPost(postId);
        PostDto postDto = new PostDto(1001, "USER 1", "POST 1001", LocalDate.of(2024, 8, 22));
        model.addAttribute("post", postDto);
        return "single-post";
    }
}

//@RestController
//@RequestMapping("/api/posts")
//class PostController {
//
//    private final PostService postService;
//
//    PostController(PostService postService) {
//        this.postService = postService;
//    }
//
//    @GetMapping
//    List<PostDto> getAllPosts() throws IOException {
//        return postService.getAllPosts();
//    }
//
//}
