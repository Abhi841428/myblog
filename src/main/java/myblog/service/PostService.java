package myblog.service;


import myblog.entity.Post;
import myblog.payload.PostDto;

public interface PostService {

    public PostDto createPost(PostDto postDto);

    Post detail(PostDto postDto);
}
