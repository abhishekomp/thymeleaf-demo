package org.aom.thymeleaf.posts.domain;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : abhishek
 * @since : Wed, 2024-Sep-18
 * Created with IntelliJ IDEA
 */
@Repository
class PostRepository {

    private static final Logger log = LoggerFactory.getLogger(PostRepository.class);

    private final ObjectMapper objectMapper;

    PostRepository(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

//    List<Post> getAllPosts() throws IOException {
//        List<Post> posts = objectMapper.readValue(new File("src/main/resources/posts.json"), new TypeReference<List<Post>>() {
//        });
//        return posts;
//    }

    //getClass().getResourceAsStream("/lambdasinaction/chap3/data.txt");

    List<Post> getAllPosts() throws IOException {

        //InputStream resourceAsStream = getClass().getResourceAsStream("src/main/resources/posts.json");
        //List<Post> posts = objectMapper.readValue(this.getClass().getResourceAsStream("posts.json"), new TypeReference<List<Post>>() {});
        List<Post> posts = objectMapper.readValue(this.getClass().getModule().getResourceAsStream("posts.json"), new TypeReference<List<Post>>() {});
        log.info("{} post objects read from the json file", posts.size());
        return posts;
    }

}
