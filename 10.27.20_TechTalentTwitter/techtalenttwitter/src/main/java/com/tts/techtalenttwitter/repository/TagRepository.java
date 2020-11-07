package com.tts.techtalenttwitter.repository;

import com.tts.techtalenttwitter.model.Tag;

import org.springframework.stereotype.Repository;

@Repository
public class TagRepository extends CrudRepository<Tag, Long> {
    
    Tag findByPhrase(String phrase);




}
