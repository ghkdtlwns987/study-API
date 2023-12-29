package com.utglobal.ufinswarmapi.domain.swarm.Services.Entity;

import jakarta.persistence.*;

public class mountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "mountType", nullable = false)
    private String type;

    @Column(name = "mountSource", nullable = false)
    private String source;

    @Column(name = "mountTarget", nullable = false)
    private String target;

    @OneToOne(mappedBy = "containerEntity")
    private containerEntity containerEntity;
}
