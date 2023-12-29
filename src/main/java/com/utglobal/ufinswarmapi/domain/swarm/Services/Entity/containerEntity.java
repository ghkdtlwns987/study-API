package com.utglobal.ufinswarmapi.domain.swarm.Services.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Service 정보를 저장하는 Entity 입니다.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class containerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "serviceVersion")
    private String serviceVersion;

    @Column(name = "serviceCreateAt")
    private LocalDate createAt;

    @Column(name = "serviceUpdateAt")
    private LocalDate updateAt;

    @Column(name = "serviceName")
    private String serviceName;

    @Column(name = "serviceImage")
    private String image;

    @Column(name = "serviceIsReplica")
    private boolean isReplica;

    @Column(name = "serviceReplicas")
    private Integer replicas;

    @Column(name = "serviceTargetPort")
    private Integer targetPort;

    @Column(name = "servicePublishPort")
    private Integer publishPort;
}
