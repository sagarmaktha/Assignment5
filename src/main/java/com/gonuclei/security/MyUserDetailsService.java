package com.gonuclei.security;

import com.gonuclei.models.entities.UserEntity;
import com.gonuclei.repositories.slave.SlaveUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * The type My user details service.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

  /**
   * The Slave user repository.
   */
  @Autowired
  private SlaveUserRepository slaveUserRepository;

  /**
   * Load user by username user details.
   *
   * @param username the username
   * @return the user details
   * @throws UsernameNotFoundException the username not found exception
   */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    final Optional<UserEntity> user = slaveUserRepository.findBymail(username);
    return new User(user.get().getMail(), user.get().getPassword(), new ArrayList<>());
  }
}
