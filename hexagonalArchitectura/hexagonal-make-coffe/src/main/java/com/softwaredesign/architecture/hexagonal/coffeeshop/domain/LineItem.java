package com.softwaredesign.architecture.hexagonal.coffeeshop.domain;

public record LineItem(Drink drink, Milk milk, Size size, int quantity) {

}
