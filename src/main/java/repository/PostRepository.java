package repository;

import entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

public interface PostRepository {


    Page<Post> findAll(Pageable pageable);

    @Repository
    public interface PostRepository extends JpaRepository<Post, Integer> {

    }
}
