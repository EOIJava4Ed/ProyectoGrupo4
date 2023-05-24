package com.eoi.ejemplospringboot.repositories;

import com.eoi.ejemplospringboot.entities.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, String> {

    Permiso findByName(String name);

}