package com.music.h2.service;

import java.util.ArrayList;
import java.util.List;

import com.music.h2.model.Music;
import com.music.h2.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public List<Music> getAllMusics() {
        List<Music> musics = new ArrayList<Music>();
        musicRepository.findAll().forEach(music -> musics.add(music));
        return musics;
    }

    public Music getMusicById(int id) {
        return musicRepository.findById(id).get();
    }

    public void saveOrUpdate(Music music) {
    	musicRepository.save(music);
    }

    public void delete(int id) {
    	musicRepository.deleteById(id);
    }

}