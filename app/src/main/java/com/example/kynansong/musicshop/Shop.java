package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */
import java.util.ArrayList;

public class Shop {

    ArrayList<ShopObjects> salesItems;

    public Shop(){
        salesItems = new ArrayList<ShopObjects>();
    }


    public void AddItemToStock(ShopObjects shopObjects) {

        this.salesItems.add(shopObjects);

    }

    public int stockCount() {
        return this.salesItems.size();
    }

}
