package com.company;

public class Question2 {
    public static void main(String[] args) {
        PsychiatristObject psychiatristObject = new PsychiatristObject();

        MoodyObject happyObject = new HappyObject();
        MoodyObject sadObject = new SadObject();

        System.out.println("How are you feeling today?");
        psychiatristObject.examine(happyObject);
        psychiatristObject.observe(happyObject);
        System.out.println("Observation: " + happyObject);

        System.out.println("How are you feeling today?");
        psychiatristObject.examine(sadObject);
        psychiatristObject.observe(sadObject);
        System.out.println("Observation: " + sadObject);
    }
}

class PsychiatristObject {
    public void examine(MoodyObject moodyObject) {
        moodyObject.queryMood();
    }

    public void observe(MoodyObject moodyObject) {
        moodyObject.expressFeelings();
    }
}

abstract class MoodyObject {
    protected abstract String getMood();

    protected abstract void expressFeelings();

    public void queryMood() {
        System.out.println(getMood());
    }
}

class HappyObject extends MoodyObject {
    protected String getMood() {
        return "I feel happy today";
    }

    protected void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}

class SadObject extends MoodyObject {
    protected String getMood() {
        return "I feel sad today";
    }

    protected void expressFeelings() {
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    }

    public String toString() {
        return "Subject cries a lot";
    }
}