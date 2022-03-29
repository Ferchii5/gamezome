package com.ferchi.gamezone.repository;

import com.ferchi.gamezone.models.ModelJuegosZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryJuegosZone extends JpaRepository<ModelJuegosZone, Long> { }
