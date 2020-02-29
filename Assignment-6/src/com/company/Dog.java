package com.company;
import java.util.Date;

public class Dog extends Pet implements Boardable {
    private String size;
    private Date boardingStart, boardingEnd;

    private class Date {
        private int Day, Month, Year;

        public Date(int Day, int Month, int Year) {
            this.Day = Day;
            this.Month = Month;
            this.Year = Year;
        }

        public boolean lessThan(Date date) {
            if (this.Year < date.Year)
                return true;
            else if (this.Year == date.Year) {
                if (this.Month < date.Month)
                    return true;
                else {
                    return this.Month == date.Month && this.Day <= date.Day;
                }
            }
            return false;
        }

        public boolean greaterThan(Date date) {
            if (this.Year > date.Year)
                return true;
            else if (this.Year == date.Year) {
                if (this.Month > date.Month)
                    return true;
                else {
                    return this.Month == date.Month && this.Day >= date.Day;
                }
            }
            return false;
        }
    }


    public Dog(String name, String ownerName, String color, String size){
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + "Size : " + this.getSize() + "\n";
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        boardingStart = new Date(day, month, year);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        boardingEnd = new Date(day, month, year);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date boarding = new Date(day, month, year);
        return (boarding.greaterThan(boardingStart) && boarding.lessThan(boardingEnd));
    }
}