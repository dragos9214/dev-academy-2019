package com.orange.mediastore.service;

import com.orange.mediastore.model.Media;
import com.orange.mediastore.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    @Autowired
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Media> getMediaList() {
        return mediaRepository.findAll();
    }

    public List<Media> getMediaByTitle(String title) {
        return mediaRepository.findAllByTitleMatchesRegex("(?i).*" + title + ".*");
    }
}
