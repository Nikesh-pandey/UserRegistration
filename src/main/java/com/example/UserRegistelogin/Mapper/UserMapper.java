package com.example.UserRegistelogin.Mapper;
import com.example.UserRegistelogin.DTOS.UserRegisterDto;
import com.example.UserRegistelogin.Entities.User;
import com.example.UserRegistelogin.DTOS.UserLoginDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    //Copying value from Entity to LoginDto(db----> user)

    public UserLoginDto mapToLogin(User user){
    return new UserLoginDto(
            user.getEmail(),
            user.getPassword()
    );
    }

    //copying balue from UserRegisterDto to ENtity(db)

    public User mapToEntity(UserRegisterDto userRegisterDto){
        return new User(
                userRegisterDto.getFname(),
                userRegisterDto.getLname(),
                userRegisterDto.getEmail(),
                userRegisterDto.getPassword()

        );
    }


}
