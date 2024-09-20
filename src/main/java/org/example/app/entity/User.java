package org.example.app.entity;

import jakarta.persistence.*;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Тут, найменування стовпця в БД
    // не збігається із найменуванням змінної.
    // Атрибут name вирішує проблему.
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

   // @Column(name = "phone")
   // private String phone;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  //  public String getPhone() {
       // return phone;
  //  }

  //  public void setPhone(String phone) {
    //    this.phone = phone;
   // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "id " + id +
                ", " + firstName + " " + lastName +
                 ", email " + email + "\n";
    }
}