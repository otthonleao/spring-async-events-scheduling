package dev.otthon.asynceventsscheduling.api.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private UUID id;

    private String name;

    private String email;

}
