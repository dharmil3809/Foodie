package com.example.ecommerce.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.ecommerce.Interface.itemClickListner;
import com.example.ecommerce.R;
import com.rey.material.widget.Spinner;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, getTxtProductPrice, txtProductQuantity;
    private itemClickListner itemClickListner;


    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.cart_product_name);
        getTxtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
    }


    @Override
    public void onClick(View view)
    {
        itemClickListner.onClick(view, getAdapterPosition(),false);
    }
    public void setItemClickListner(com.example.ecommerce.Interface.itemClickListner itemClickListner)
    {
        this.itemClickListner = itemClickListner;
    }


}
