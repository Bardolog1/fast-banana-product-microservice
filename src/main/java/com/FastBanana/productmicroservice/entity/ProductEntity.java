package com.FastBanana.productmicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
   private Double unitPrice;
   private byte[] productImage;
    private String nameImage;
    private String contentTypeImage;




}
