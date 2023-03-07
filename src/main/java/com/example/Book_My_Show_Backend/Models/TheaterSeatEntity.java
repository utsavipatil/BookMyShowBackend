package com.example.Book_My_Show_Backend.Models;

import com.example.Book_My_Show_Backend.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "seat_no" , nullable = false)
    private String seatNo;
    @Enumerated (value = EnumType.STRING)
    private SeatType seatType;
    private int rate;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;
}
