package com.example.themeparkapp.service;

import com.example.themeparkapp.model.Themepark;

import java.util.Optional;

public interface ThemeparkService {
    public Iterable<Themepark> findAll();
    public Optional<Themepark> findByName(String rideName);
    public Themepark updateRating(Themepark themepark);
    public Themepark updateVomitFactor(Themepark themepark);
    public Themepark createRide(Themepark themepark);
}
