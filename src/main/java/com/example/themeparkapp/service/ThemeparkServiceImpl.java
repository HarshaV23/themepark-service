package com.example.themeparkapp.service;

import com.example.themeparkapp.dao.ThemeparkRepo;
import com.example.themeparkapp.model.Themepark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ThemeparkServiceImpl implements ThemeparkService {
    @Autowired
    ThemeparkRepo themeparkRepo;

    @Override
    public Iterable<Themepark> findAll() {
        return themeparkRepo.findAll();
    }

    @Override
    public Optional<Themepark> findByName(String rideName) {
        return themeparkRepo.findByRideName(rideName);
    }

    @Override
    public Themepark updateRating(Themepark themepark) {
        return themeparkRepo.save(themepark);
    }

    @Override
    public Themepark updateVomitFactor(Themepark themepark) {
        return themeparkRepo.save(themepark);
    }

    @Override
    public Themepark createRide(Themepark themepark) {
        return themeparkRepo.save(themepark);
    }
}
