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
@Table(name = "libraries")
public class LibraryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lib_id")
    private Long id;

    @Column(name = "lib_name", nullable = false)
    private String name;

    @Column(name = "lib_phone")
    private String phone;

    @Column(name = "lib_domain")
    @Enumerated(EnumType.STRING)
    private DomainType domainType;

    @OneToOne
    @JoinColumn(name="lib_andress")
    private AddressEntity address;
}