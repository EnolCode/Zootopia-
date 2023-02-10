package com.zootopia.demo.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;



@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = true)
    private Date date;

    public Animal() {
    }

    public Animal(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "family_id", nullable = true)
    Family family;

    // @ManyToOne
    // @JoinColumn(name= "id_type",nullable = true)
    // TipoEntity type;

    // @ManyToOne
    // @JoinColumn(name= "id_genero",nullable = true)
    // GeneroEntity genero;

    // @ManyToOne
    // @JoinColumn(name= "id_pais",nullable = true)
    // PaisEntity pais;

    // @OneToMany(mappedBy ="type")
    // private List<TipoEntity> typeAnimal;

    // @OneToMany(mappedBy ="GeneroEntity")
    // private List<GeneroEntity> gEntity;

    // @OneToMany(mappedBy ="FamilyEntity")
    // private List<FamilyEntity> fEntity;

    // @OneToMany(mappedBy ="PaisEntity")
    // private List<PaisEntity> pEntity;

}
