package com.example.socialmedia.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String roles;
}
