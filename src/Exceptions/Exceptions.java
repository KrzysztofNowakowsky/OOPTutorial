package Exceptions;

public class Exceptions{
    static void testA(){
        try{
            System.out.println("inside testA");
            throw new RuntimeException("lala");
        }finally{
            System.out.println("finally of A");
        }
    }
    static void testB(){
        try{
            System.out.println("inside testB");
            return;
        }
        finally{
            System.out.println("finally of B");
        }
    }




}