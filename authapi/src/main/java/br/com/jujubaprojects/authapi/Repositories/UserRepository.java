package br.com.jujubaprojects.authapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.jujubaprojects.authapi.domain.User.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
   UserDetails findByLogin(String login);
}
