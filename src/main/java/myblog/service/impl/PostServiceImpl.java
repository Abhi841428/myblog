package myblog.service.impl;

import myblog.entity.Post;
import myblog.payload.PostDto;
import myblog.repository.PostRepository;
import myblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
@Autowired
private PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        postRepository.save(post);
        postDto.setId(post.getId());
        return postDto;
    }

    @Override
    public Post detail(PostDto postDto) {
        Post post = postRepository.findById(postDto.getId()).orElseThrow();
        return post;
    }
}
