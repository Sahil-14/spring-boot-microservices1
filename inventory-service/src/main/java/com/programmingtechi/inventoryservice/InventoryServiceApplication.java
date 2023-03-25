package com.programmingtechi.inventoryservice;

import com.programmingtechi.inventoryservice.model.Inventory;
import com.programmingtechi.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(100);



			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("redmi");
			inventory.setQuantity(1200);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
