package com.example.notasservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "notas")
@NoArgsConstructor
@AllArgsConstructor
public class NotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private int alumno;
    private int puntaje;
    private LocalDate fecha;

    public NotaEntity(int alumno, int puntaje, LocalDate fecha) {
        this.alumno = alumno;
        this.puntaje = puntaje;
        this.fecha = fecha;
    }
}
