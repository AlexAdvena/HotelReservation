package model;

public class FreeRoom extends Room{


    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price, enumeration);
   this.price = 0.00;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }

    @Override
    public String toString(){
        return super.toString();
    }


}
