package com.example.themeparkapp.dao;

import com.example.themeparkapp.model.Themepark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThemeparkRepo extends JpaRepository<Themepark,String> {
    public Optional<Themepark> findByRideName(String rideName);
}
