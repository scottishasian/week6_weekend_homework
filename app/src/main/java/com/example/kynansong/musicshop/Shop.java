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


    public void addItemToStock(ShopObjects shopObjects) {

        this.salesItems.add(shopObjects);

    }

    public void removeItemFromStock(int i) {
        this.salesItems.remove(i);
    }

    public int stockCount() {
        return this.salesItems.size();
    }

}
