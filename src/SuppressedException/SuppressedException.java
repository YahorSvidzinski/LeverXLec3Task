package SuppressedException;

import Throwing.BadResources;

import java.util.Arrays;

public class SuppressedException{
    public static void tryFunction () throws Exception {
        try (BadResources resources = new BadResources()){
            resources.accessResource();

        }
    }
    public static void main(String[] args) throws Exception {
        try {
            tryFunction();
        }
        catch (Exception ex){
            System.out.println("Exception appeared: "+ ex.toString());
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
            if (numSuppressed > 0){
                System.out.println("There are "+ numSuppressed +" suppressed exceptions:");
                for (final Throwable exception : suppressedExceptions)
                {
                    System.out.println(exception.toString());
                }
            }
        }

    }
}