package com.geekster.Instagram.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column(nullable = false)
    private LocalDateTime createdDate;


    @Column(nullable = false)
    @NotEmpty
    private String postData;

    private String postCaption;

    @Pattern(regexp = "[A-Za-z\\D0-9]")
    private String location;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;

}