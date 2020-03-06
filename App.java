package com.epam.CollectionsList;

public class App 
{
    public static void main( String[] args )
    {
       CustomList<String> list=new CustomList<>();
       list.add("Hi");
       list.add("This");
       list.add("is");
       list.add("Java");
       list.add("Programming");
       list.add("GDD");
       list.add("Concept");
       list.print();
       list.remove(6);
       list.print();
    }
}
