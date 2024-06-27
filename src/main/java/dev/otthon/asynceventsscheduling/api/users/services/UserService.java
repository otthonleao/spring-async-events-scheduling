package dev.otthon.asynceventsscheduling.api.users.services;

import dev.otthon.asynceventsscheduling.api.users.dtos.UserRequestDTO;
import dev.otthon.asynceventsscheduling.api.users.dtos.UserResponseDTO;
import dev.otthon.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MailService mailService;

    public UserResponseDTO create(UserRequestDTO userRequestDTO) {
        // Simular o cadastro de um usuário
        var user = new UserResponseDTO(
                UUID.randomUUID(),
                userRequestDTO.getName(),
                userRequestDTO.getEmail()
        );
        // Envio de e-mail de boas vindas
        mailService.send(
                user.getEmail(), "Boas Vindas", "Seja be-vindo a nossa aplicação!"
        );
        // Finalizaçãp do método
        return user;
    }

}
