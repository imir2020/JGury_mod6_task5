package by.javagury.spring.mapper;

import by.javagury.spring.database.entity.User;
import by.javagury.spring.dto.UserDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;


@ToString
@NoArgsConstructor

public class UserMapper {

    public UserDto userToDto(User user) {
        return UserToDtoMapper.INSTANCE.fromUserToDto(user);
    }
}
