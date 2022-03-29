package com.ferchi.gamezone.repository;

import com.ferchi.gamezone.models.ModelJuegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryJuegos extends JpaRepository<ModelJuegos, Long> { }
