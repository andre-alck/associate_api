package com.api.associate.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.associate.models.*;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}