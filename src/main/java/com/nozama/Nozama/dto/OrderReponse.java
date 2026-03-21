package com.nozama.Nozama.dto;

import com.nozama.Nozama.model.CartItem;

import java.util.List;

public record OrderReponse (
        String username,
        List<CartItem> carrinho,
        double totalPrice
) {
}