package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
// Correccion aplicada, el jakarta tenia un * e iba id para que @Id funcionara
import java.util.List;

@Entity
@Table(name = "docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private  String especialidad;

    @OneToMany(mappedBy = "docente")
    @JsonManagedReference(value = "docente-curso")
    private List<Curso> cursos;

    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonManagedReference(value = "docente-usuario")
    private Usuario usuario;


    public Docente() {
    }

    public Docente(Integer id, String especialidad, List<Curso> cursos, Usuario usuario) {

        this.especialidad = especialidad;
        this.cursos = cursos;
        this.usuario = usuario;
    }


    public Integer getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}