package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain;


import lombok.Data;

@Data
public record LineItem(Drink drink, Milk milk, Size size, int quantity) {

}
