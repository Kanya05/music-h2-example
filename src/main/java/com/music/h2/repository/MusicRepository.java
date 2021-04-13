package com.music.h2.repository;
	
import com.music.h2.model.Music;
import org.springframework.data.repository.CrudRepository;

public interface MusicRepository extends CrudRepository<Music, Integer> {}