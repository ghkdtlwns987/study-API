package com.utglobal.ufinswarmapi.domain.swarm.Services.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class serviceCreate {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "serviceName", nullable = false)
    private String serviceName;

    @Column(name = "serviceConstraint", nullable = true)
    private String serviceConstraint;

    @Column(name = "serviceReplica", nullable = false)
    private String serviceReplica;

    @Column(name = "serviceMountSrc", nullable = true)
    private String serviceMountSrc;

    @Column(name = "serviceMountDst", nullable = true)
    private String serviceMountDst;

    @Column(name = "serviceCreateAt", nullable = false)
    private LocalDate serviceCreateAt;

    @Column(name = "serviceModifiedAt", nullable = true)
    private LocalDate serviceModifiedAt;

    @Builder
    private serviceCreate(Long id, String serviceName, String serviceConstraint, String serviceReplica, String serviceMountSrc, String serviceMountDst, LocalDate serviceCreateAt, LocalDate serviceModifiedAt) {
        Id = id;
        this.serviceName = serviceName;
        this.serviceConstraint = serviceConstraint;
        this.serviceReplica = serviceReplica;
        this.serviceMountSrc = serviceMountSrc;
        this.serviceMountDst = serviceMountDst;
        this.serviceCreateAt = serviceCreateAt;
        this.serviceModifiedAt = serviceModifiedAt;
    }
}
