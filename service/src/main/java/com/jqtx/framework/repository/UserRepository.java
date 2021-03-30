package com.jqtx.framework.repository;

import com.jqtx.framework.generated.tables.pojos.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findByUid(String username);

    Boolean existsByUid(String username);

    Boolean existsByEmail(String email);

}
