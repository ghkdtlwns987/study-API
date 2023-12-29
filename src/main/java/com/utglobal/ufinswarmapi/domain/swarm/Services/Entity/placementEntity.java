package com.utglobal.ufinswarmapi.domain.swarm.Services.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class placementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "constraints", nullable = false)
    private String constrains;

    @OneToOne(mappedBy = "containerEntity")
    private containerEntity containerEntity;
}
