package com.example.Book_My_Show_Backend.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileNo;

    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP) //Date & Time format
    private Date createdOn;

    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedOn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TicketEntity> listOfTickets;
}
