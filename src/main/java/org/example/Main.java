package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ParentClass parentClass=new ParentClass();
        ChildClass childClass=new ChildClass();
        ParentClass refParentobjChild=new ChildClass();
        //parentClass=(ParentClass)childClass;
        childClass.ParentClassMethod();

    }
}