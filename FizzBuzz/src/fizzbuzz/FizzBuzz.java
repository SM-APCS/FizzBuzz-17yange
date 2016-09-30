/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Eddie Yang - CHANGE TO YOUR NAME
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param program checks to see if the number is divisible by 15 first.
     * @param If it is it displays Fizzbuzz then repeats the for loop for the next number
     * @param then it checks to see if divisible by 3 or 5
     * @param if it is then it displays Fizz or Buzz respectively and repeats the for loop until it stops at 100
     */
    public static void main(String[] args) 
    {
        for(int i = 1; i < 101; i++)
        {
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);  
            }
        }
    }
}
