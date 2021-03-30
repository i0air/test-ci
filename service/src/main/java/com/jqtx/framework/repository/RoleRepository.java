package com.jqtx.framework.repository;

import com.jqtx.framework.generated.tables.pojos.Role;

import java.util.Optional;

public interface RoleRepository {
    Optional<Role> findByCode(String code);
}
