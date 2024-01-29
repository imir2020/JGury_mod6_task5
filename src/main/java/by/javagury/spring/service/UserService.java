package by.javagury.spring.service;

import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.dto.UserDto;
import by.javagury.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@ToString
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public Optional<UserDto> findById(Long id){
        return userRepository.findById(id).map(userMapper::userToDto);
    }

}
