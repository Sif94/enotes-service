package org.baouz.enotesapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.baouz.enotesapi.commun.BaseEntity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Category extends BaseEntity {
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private Boolean isActive;
    private Boolean isDeleted;

}

