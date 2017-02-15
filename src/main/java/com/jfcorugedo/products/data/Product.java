package com.jfcorugedo.products.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Product {

	private String id;//NOSONAR
	private String name;//NOSONAR
	private Double price;//NOSONAR
}
