package com.example.pruebaNahuel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto,Long> {
}
