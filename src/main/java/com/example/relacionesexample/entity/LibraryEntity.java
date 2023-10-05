package com.example.relacionesexample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "library")
public class LibraryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lib_id")
    private Long id;

    @Column(name = "lib_name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name="lib_andress")
    private AddressEntity address;
}