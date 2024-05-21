package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if there's already data in the database
        if (partRepository.count() == 0 && productRepository.count() == 0 && outsourcedPartRepository.count() == 0) {
            // Add sample parts
            for (int i = 1; i <= 5; i++) {
                InhousePart inhousePart = new InhousePart();
                inhousePart.setName("Part " + i);
                inhousePart.setPrice(10.0 * i);
                inhousePart.setInv(20);
                partRepository.save(inhousePart);
            }

            // Add sample products
            for (int i = 1; i <= 5; i++) {
                Product product = new Product();
                product.setName("Product " + i);
                product.setPrice(100.0 * i);
                product.setInv(10);
                productRepository.save(product);
            }

            // Add sample outsourced parts
            for (int i = 1; i <= 5; i++) {
                OutsourcedPart outsourcedPart = new OutsourcedPart();
                outsourcedPart.setName("Outsourced Part " + i);
                outsourcedPart.setPrice(15.0 * i);
                outsourcedPart.setInv(15);
                outsourcedPart.setCompanyName("Supplier " + i);
                outsourcedPartRepository.save(outsourcedPart);
            }

            System.out.println("Sample inventory added successfully.");
        } else {
            System.out.println("Inventory already exists. Skipping bootstrap.");
        }
    }
}
