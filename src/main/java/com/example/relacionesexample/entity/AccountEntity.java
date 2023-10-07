package com.example.relacionesexample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_id")
    private Integer id;

    @Column(name = "acc_description")
    private String description;

    @Column(name = "acc_owner")
    private String owner;

    @Column(name = "acc_date_created")
    private LocalDate dateCreated;

    @ManyToOne
    @JoinColumn(name = "acc_bank")
    private BankEntity bank;
}
