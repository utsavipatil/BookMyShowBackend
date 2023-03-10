package com.example.Book_My_Show_Backend.Service;

import com.example.Book_My_Show_Backend.Dtos.MovieRequestDto;
import com.example.Book_My_Show_Backend.Models.MovieEntity;
import com.example.Book_My_Show_Backend.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieRequestDto movieRequestDto){
        //Convert Dto to Entity layer for saving it to Database
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getMovieName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();
        try{
            movieRepository.save(movie);
        }catch(Exception e){
            return "Movie could not added :( ";
        }
        return "Movie added successfully :) ";
    }
}
