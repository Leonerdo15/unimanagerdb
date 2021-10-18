package pt.iade.unimanagerdb.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int id;
    @Column(name = "stu_name")
    private String name;
    @Column(name = "stu_bdate")
    private LocalDate BDate;

    public Unit() {
    }
  
    public String getName() {
        return name;
    }

   
    public int getId() {
        return id;
    }


    public LocalDate getCredits() {
        return BDate;
    }
}
