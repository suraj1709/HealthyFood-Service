package com.healthyfood.foodcontentservice.FoodContentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.healthyfood.foodcontentservice.FoodContentService.controller.FoodServiceController;
import com.healthyfood.foodcontentservice.FoodContentService.repo.FoodContentRepo;
import com.healthyfood.foodcontentservice.FoodContentService.repo.ItemRepo;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages= {"com.healthyfood.foodcontentservice.FoodContentService","com.healthyfood.foodcontentservice.Security","com.healthyfood.foodcontentservice.Config"})
@EntityScan("com.healthyfood.foodcontentservice.FoodContentService.model")
@EnableJpaRepositories(basePackageClasses = {ItemRepo.class,FoodContentRepo.class})
public class FoodContentServiceApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(FoodContentServiceApplication.class, args);
	}

}