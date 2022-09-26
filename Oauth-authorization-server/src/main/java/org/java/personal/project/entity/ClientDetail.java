package org.java.personal.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "oauth_client_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDetail {
    @Id
    private String clientId;

    private String resourceId;
    private String clientSecret;
    private String scope;
    private String authorizeGrantTypes;
    private String webServerRedirectUrl;
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String additionalInfo;
    private String autoApprove;

    @CreationTimestamp
    private Date createdAt;

    @LastModifiedDate
    private Date lastModified;

    @DBRef
    private DummyUser dummyUser;
}
