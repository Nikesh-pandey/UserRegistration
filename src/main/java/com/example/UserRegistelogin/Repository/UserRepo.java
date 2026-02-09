package com.example.UserRegistelogin.Repository;
import com.example.UserRegistelogin.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}
