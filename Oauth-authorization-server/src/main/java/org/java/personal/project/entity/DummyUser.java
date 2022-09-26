package org.java.personal.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "user_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DummyUser implements Serializable {
    @Id
    private String id;

    private String username;
    private String nickname;
    private String password;
    private String address;
    private String email;
    private String phoneNumber;
    private String profilePicture;
    private boolean isEnabled;
    private boolean isProtectedAccount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date dateOfBirth;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date lastModified;

    @DBRef
    private DummyUserRole dummyUserRole;
}
