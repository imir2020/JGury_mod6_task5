package by.javagury.spring.mapper;

import by.javagury.spring.database.entity.User;
import by.javagury.spring.dto.UserDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;


@ToString
@NoArgsConstructor
@Component
public class UserMapper {

    public UserDto userToDto(User user) {
//        return UserDto.builder()
//                .id(user.getId())
//                .localDateTime(user.getLocalDateTime())
//                .firstname(user.getFirstname())
//                .lastname(user.getLastname())
//                .role(user.getRole())
//                .companyId(user.getCompanyId())
//                .build();
//    }
        return UserToDtoMapper.INSTANCE.fromUserToDto(user);
    }
}
