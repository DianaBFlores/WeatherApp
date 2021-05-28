package com.tts.WeatherApp.repository;


import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {
}