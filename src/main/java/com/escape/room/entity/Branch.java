package com.escape.room.entity;

import com.escape.room.enums.Area;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id" )
    private Store store;

    private String name;

    private String url;

    private String address;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Area area;

    @Column(name = "create_at", nullable = false, insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_At")
    @LastModifiedDate
    private LocalDateTime updateAt;

}
