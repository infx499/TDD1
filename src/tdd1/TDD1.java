/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd1;
import java.util.Scanner;

public class TDD1 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Robot peter = new Robot();
        peter.setname("Peter");
        peter.setwalk(1);
        peter.setrun(4);
        peter.setskip(2);
        peter.setjump(3);
        peter.testName();
        peter.testWalk();
        peter.testRun();
        peter.testSkip();
        peter.testJump();
        
        System.out.print("Give the robot an action, valid options are walk, run, skip, jump:");
        String filename = input.next();
        peter.setaction(filename);
        peter.testAction();
      
    }

 

 
}
