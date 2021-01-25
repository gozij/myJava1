package com.company;

public class Main {

    private static class Inner {

        public void printStatement() {

            System.out.println( " Hello from an inner class!" );

        }

    }

        private static int myInt = 30;


        public static void main(String[] args) {

            Main myMain = new Main();
            System.out.println(myInt);


            //illegal field name for myMain
            //int myBook = "book";
            // void Main myMain = new Main();

            //local variable
            int myInt = 10;
            System.out.println(myInt);

        }
        }

