package com.example.themeparkapp;

import com.example.themeparkapp.dao.ThemeparkRepo;
import com.example.themeparkapp.model.Themepark;
import com.example.themeparkapp.service.ThemeparkService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class ThemeparkAppApplicationTests {
	@Autowired
	private ThemeparkService themeparkService;

	@MockBean
	private ThemeparkRepo themeparkRepo;

	@Test
	public void getRides(){
		when(themeparkRepo.findAll()).thenReturn(Stream.of(new Themepark("001","RollerCoaster",5,4)).collect(Collectors.toList()));
		int res=themeparkRepo.findAll().size();
		assertEquals(1,res);
	}
	@Test
	void contextLoads() {
	}

}
