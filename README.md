<h1 align="center">📱 Instagram Application 🗨️</h1>

This repository contains the code for an Instagram-like application, which allows users to sign up, sign in, follow other users, like posts, add comments, and perform administrative tasks. The application is built using Java and follows a controller-based architecture.


## Frameworks and Language used

[![JAVA Docs](https://img.shields.io/badge/JAVA-v20.0.1-blue.svg)](https://docs.oracle.com/en/java/)
[![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v3.0.6-yellow.svg)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)


## Required Dependencies

To run this project, you will need to add the following dependencies to your pom.xml file

`Spring Web`, `Spring Boot Dev Tool`, `Lombok`, `Validation`, `Spring Data JPA`, `MySql Driver`, `Swagger-UI`


## Entities
The following entities are used in the application:

* #### `User`: Represents a user of the Instagram application.
* #### `Admin`: Represents an administrator of the Instagram application.
* #### `Post`: Represents a post made by a user.
* #### `AuthenticationToken`: Represents an authentication token used to authenticate users.
* #### `InstagramComment`: Represents a comment made on a post.
* #### `InstagramFollower`: Represents a user's follower.
* #### `InstagramFollowing`: Represents a user's following.

## Controllers
The application's controllers are organized into different packages:

* #### `UserController`: Handles user-related actions such as sign up, sign in, follow user, and like post.
* #### `AdminController`: Handles administrative tasks such as verifying users with a blue tick.
* #### `CommentController`: Handles actions related to comments, such as adding a comment.
* #### `PostController`: Handles actions related to posts, such as adding a post and retrieving all posts.

## AdminController Methods
The `AdminController` provides the following methods:

* #### `toggleBlueTick()`: Allows an administrator to verify a user by assigning a blue tick to their account.

## CommentController Methods
The `CommentController` provides the following method:

* #### `addComment()`: Allows a user to add a comment to a post.

## PostController Methods
The PostController provides the following methods:

* #### `addPost()`: Allows a user to add a post.
* #### `getAllPosts()`: Retrieves all posted posts.

## DataBase Design
#### Used MySQL DataBase

```
    
    create table authentication_token (
        token_id bigint not null auto_increment,
        token varchar(255),
        token_creation_date date,
        fk_user_id bigint not null,
        primary key (token_id)
    )
    create table instagram_admin (
        admin_id bigint not null auto_increment,
        email varchar(255) not null,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        primary key (admin_id)
    ) 
    create table instagram_comment (
        comment_id bigint not null auto_increment,
        comment_body varchar(255),
        fk_post_id integer not null,
        fk_user_id bigint not null,
        primary key (comment_id)
    )
    create table instagram_follower (
        follower_table_id bigint not null       auto_increment,
        follower_user_id bigint,
        user_user_id bigint,
        primary key (follower_table_id)
    )
    create table instagram_following (
        following_table_id bigint not null auto_increment,
        following_user_id bigint,
        user_user_id bigint,
        primary key (following_table_id)
    ) 
    create table post (
        post_id integer not null auto_increment,
        created_date datetime(6) not null,
        location varchar(255),
        post_caption varchar(255),
        post_data varchar(255) not null,
        fk_user_id bigint not null,
        primary key (post_id)
    )
    create table post_like (
        like_id bigint not null auto_increment,
        fk_post_id integer not null,
        fk_user_id bigint not null,
        primary key (like_id)
    )
    create table user (
        user_id bigint not null auto_increment,
        dob date not null,
        email varchar(255) not null,
        first_name varchar(255) not null,
        instagram_bio varchar(255),
        instagram_name varchar(255) not null,
        is_blue_ticked bit not null,
        last_name varchar(255) not null,
        password varchar(255) not null,
        phone_number varchar(255) not null,
        primary key (user_id)
    )

```

## Data Structure used in project :
- List

## Contribution
Contributions to the Todo_Application project are welcome. If you would like to contribute, please refer to the guidelines outlined in the CONTRIBUTING.md file. Bug fixes, feature enhancements, and documentation improvements are highly appreciated.

## Project Summary :

`This project is an Instagram-like application developed in Java. It provides functionalities for users to sign up, sign in, follow other users, like posts, add comments, and perform administrative tasks. The application follows a controller-based architecture, with separate controllers for user actions, administrative tasks, comments, and posts. Users can interact with the application through the UserController, AdminController, CommentController, and PostController classes. The UserController handles user-related actions such as sign up, sign in, following users, and liking posts. The AdminController is responsible for administrative tasks, such as verifying users with a blue tick. The CommentController allows users to add comments to posts, and the PostController handles actions related to posts, including adding posts and retrieving all posts. The code in this repository provides a foundation for building an Instagram-like application and can be further developed and customized as per specific requirements`

