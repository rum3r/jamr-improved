package com.ksv.jamrimproved.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Data
@Table(name = "POST_INFO", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private String id;
    private String title;
    private String body;
}
