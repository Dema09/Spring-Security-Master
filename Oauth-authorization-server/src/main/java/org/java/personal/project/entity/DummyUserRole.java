package org.java.personal.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DummyUserRole {

    @Id
    private String id;
    private String userRole;

}
