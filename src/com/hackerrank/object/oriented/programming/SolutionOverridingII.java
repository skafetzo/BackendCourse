package com.hackerrank.object.oriented.programming;

/*Solves the Overriding II problem of Object Oriented Programming*/


class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class SolutionOverridingII{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}

