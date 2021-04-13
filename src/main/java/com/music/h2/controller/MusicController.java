package com.music.h2.controller;
import java.util.List;

import com.music.h2.model.Music;
import com.music.h2.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired
    MusicService musicService;

    @GetMapping("/musics")
    private List<Music> getAllMusics() {
        return musicService.getAllMusics();
    }

    @GetMapping("/musics/{id}")
    private Music getMusic(@PathVariable("id") int id) {
        return musicService.getMusicById(id);
    }

    @DeleteMapping("/musics/{id}")
    private void deleteMusic(@PathVariable("id") int id) {
        musicService.delete(id);
    }

    @PostMapping("/musics")
    private int saveMusic(@RequestBody Music music) {
        musicService.saveOrUpdate(music);
        return music.getId();
    }
}