package com.bls.matrix.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Table(name="User")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "branch")
    private String branch;

    @Column(name = "custName")
    private String custName;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Matrix> matrices;

}
