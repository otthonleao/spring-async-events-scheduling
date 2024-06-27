package dev.otthon.asynceventsscheduling.api.controllers;

import dev.otthon.asynceventsscheduling.api.users.dtos.UserRequestDTO;
import dev.otthon.asynceventsscheduling.api.users.dtos.UserResponseDTO;
import dev.otthon.asynceventsscheduling.api.users.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    @PostMapping
    public UserResponseDTO create(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.create(userRequestDTO);
    }

}
