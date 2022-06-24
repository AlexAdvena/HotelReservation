package model;

import java.util.Date;

public class Reservation {

    Customer customer = new Customer("", "", "");
    IRoom room = new IRoom() {
        @Override
        public String getRoomNumber() {
            return null;
        }

        @Override
        public Double getRoomPrice() {
            return null;
        }

        @Override
        public RoomType getRoomType() {
            return null;
        }

        @Override
        public boolean isFree() {
            return false;
        }
    };
    Date checkInDate = new Date();
    Date checkOutDate = new Date();
    @Override
    public String toString(){
        return " "+ customer + " "+ checkInDate + " "+ checkOutDate;
    }
}



