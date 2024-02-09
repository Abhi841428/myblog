package myblog.service;


import myblog.entity.Post;
import myblog.payload.PostDto;

import java.util.Optional;

public interface PostService {

    public PostDto createPost(PostDto postDto);

    Post
    detail(PostDto postDto);
}
