package com.learn.bases.polimorthism.overriding;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 12.04.13
 * Time: 22:57
 * To change this template use File | Settings | File Templates.
 */
public class SecondChild extends ParentClass{
    @Override
    public void printSomething() {
        System.out.println("Printing something in second");
    }
}