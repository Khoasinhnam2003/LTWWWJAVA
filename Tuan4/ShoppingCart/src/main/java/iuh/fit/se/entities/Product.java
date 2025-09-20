package iuh.fit.se.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {
    private int id;
    private String name;
    private double price;
    private String image;

    public Product(String s, int i, String image) {
    }
}
