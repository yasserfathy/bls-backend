package com.bls.matrix.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Table(name = "Button")
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class ReservedButton {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "xlocation")
    private int xlocation;
    @Column(name = "ylocation")
    private int ylocation;
    @Column(name = "text")
    private String text;
    @Column(name = "matrix_id")
    private int matrixId;
}
