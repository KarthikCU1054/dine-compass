package com.devdk.dine_compass.domain.entities;

import java.util.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Review {

    private String id;

    private String content;

    private Integer rating;

    private LocalDateTime datePosted;

    private LocalDateTime lastEdited;

    private List<Photo> photos = new ArrayList<>();

    private User writtenBy;

}
