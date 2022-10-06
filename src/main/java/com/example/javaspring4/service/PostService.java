package com.example.javaspring4.service;


import com.example.javaspring4.exception.NotFoundException;
import com.example.javaspring4.model.Post;
import com.example.javaspring4.repository.PostRepository;


import java.util.Collection;

public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Collection<Post> all() {
        return repository.all();
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(long id) {
        repository.removeById(id);
    }
}
