package com.bls.matrix.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

import com.bls.matrix.entity.User;

import java.util.List;

@Table(name = "Matrix")
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Matrix {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "rowNum")
    private int rowNum;
    @Column(name = "colNum")
    private int colNum;
    //    @JsonIgnore
    //    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    //    @JoinColumn(name = "user_Id", nullable = false)
    @Column(name = "user_id")
    private int userId;
    @OneToMany(mappedBy = "matrixId", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<ReservedButton> buttons;
}
