package br.com.jujubaprojects.authapi.Model.domain.User;

import br.com.jujubaprojects.authapi.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
