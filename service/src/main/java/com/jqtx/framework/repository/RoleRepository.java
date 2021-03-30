package com.jqtx.framework.repository;

import com.jqtx.framework.generated.tables.pojos.Role;
import com.jqtx.framework.generated.tables.pojos.User;

import java.util.Optional;
import java.util.Set;

public interface RoleRepository {
    Optional<Role> findByCode(String code);
    Set<Role> getByUser(User user);
}
