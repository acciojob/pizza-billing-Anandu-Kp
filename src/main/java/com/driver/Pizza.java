package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int cheese;
    int toppings;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isCheeseAdded=false;
        isToppingsAdded=false;
        isTakeAwayAdded=false;
        isBillAdded=false;
        bill="";
       if(isVeg)
       {
           price=300;
           toppings=70;
       }
       else
       {
           price=400;
           toppings=120;
       }
       cheese=80;
        bill+="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded)
        {
            price+=cheese;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded)
        {
            price+=toppings;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded)
        {
            price+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillAdded)
        {
            isBillAdded=true;
            if(isCheeseAdded)
            {
                bill+="Extra Cheese Added: "+cheese+"\n";
            }
            if(isToppingsAdded)
            {
                bill+="Extra Toppings Added: "+toppings+"\n";
            }
            if(isTakeAwayAdded)
            {
                bill+="Paperbag Added: 20\n";
            }
            bill+="Total Price: "+price+"\n";
        }
        return this.bill;
    }
}
