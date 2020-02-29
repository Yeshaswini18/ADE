package com.company;

public class Pet {
    private String name, owner, color;
    public static final int MALE=1, FEMALE=2, SPAYED=3, NEUTERED=4;
    private enum sex {MALE, FEMALE, SPAYED, NEUTERED};
    protected sex petSex;

    public Pet (String name, String ownerName, String color) {
        this.name = name;
        this.owner = ownerName;
        this.color = color;
    }

    String getPetName() {
        return name;
    }

    String getOwnerName() {
        return owner;
    }

    String getColor() {
        return color;
    }

    void setSex(int sexid) {
        if (sexid == MALE) {
            petSex = sex.MALE;
        } else if(sexid == FEMALE) {
            petSex = sex.FEMALE;
        } else if(sexid == SPAYED) {
            petSex = sex.SPAYED;
        } else if(sexid == NEUTERED) {
            petSex = sex.NEUTERED;
        } else {
            System.out.println("Invalid input");
        }
    }

    String getSex() {
        return petSex.toString();
    }

    @Override
    public String toString() {
        String sHelp = this.getClass().getName().toUpperCase();
        return sHelp.substring(sHelp.lastIndexOf(".") + 1) + ":\n" + this.name + " owned by " +
                this.owner + "\nColor: " + this.color + "\nSex: " + this.getSex() + "\n";
    }

}
