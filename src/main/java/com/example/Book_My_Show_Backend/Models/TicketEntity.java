package com.example.Book_My_Show_Backend.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table (name = "tickets")
public class TicketEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String allotedSeats;
    private int amount;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private UserEntity user;

    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket" , cascade = CascadeType.ALL)
    private List<ShowSeatEntity> bookedSeats;
}
