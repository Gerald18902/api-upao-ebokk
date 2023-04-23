package com.upao.ebook.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name= "books")   //En plural
@Data   //Getters and setters
@NoArgsConstructor      //Constructor sin argumentos
@AllArgsConstructor     //Constructor con todos los argumentos
@ToString
public class Book {     //En singular
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "title", nullable = false)
    private String title;
    @Column(name= "author", nullable = false)
    private String author;
    @Column(name= "description", nullable = false)
    private String description;
    @Column(name= "image_url", nullable = false)
    private String imageUrl;
    /*
    @Column(name= "created_at")
    private LocalDateTime createdAt;
    @Column(name= "update_at")
    private LocalDateTime updateAt;
    */
}
