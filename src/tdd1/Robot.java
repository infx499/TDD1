package tdd1;

import tdd1.*;

public class Robot {

    private String name = "Harry";
    private int walkSpeed = 0;
    private int runSpeed = 0;
    private int skipSpeed = 0;
    private int jumpSpeed = 0;
    private String action = null;
    private int posA = 0;
    private int posB = 0;

    public Robot() {
    }

    public void setwalk(int a) {
        this.walkSpeed = a;
    }

    public void setrun(int a) {
        this.runSpeed = a;
    }

    public void setjump(int a) {
        this.jumpSpeed = a;
    }

    public void setskip(int a) {
        this.skipSpeed = a;
    }

    public void setname(String a) {
        this.name = a;
    }

    public void setaction(String a) {
        this.action = a;
    }

    public String getaction() {
        return this.action;
    }

    public int getA() {
        return this.posA;
    }

    public int getB() {
        return this.posB;
    }

    public void resetAB() {
        this.posA = 0;
        this.posB = 0;
    }

    public String getname() {
        return this.name;
    }

    public void go() {
        if (this.action == "walk") {
            this.posA = this.posA + walkSpeed;
        }
        if (this.action == "run") {
            this.posA = this.posA + runSpeed;
        }
        if (this.action == "skip") {
            this.posA = this.posA + skipSpeed;
        }
        if (this.action == "jump") {
            this.posA = this.posA + jumpSpeed;
        }
    }

    public void testWalk() {
        this.resetAB();
        this.setaction("walk");
        this.go();
        System.out.print("Walk location:");
        System.out.print(this.getA());
        System.out.print(",");
        System.out.println(this.getB());

    }

    public void testRun() {
        this.resetAB();
        this.setaction("run");
        this.go();
        System.out.print("Run location:");
        System.out.print(this.getA());
        System.out.print(",");
        System.out.println(this.getB());

    }

    public void testSkip() {
        this.resetAB();
        this.setaction("skip");
        this.go();
        System.out.print("Skip location:");
        System.out.print(this.getA());
        System.out.print(",");
        System.out.println(this.getB());

    }

    public void testJump() {
        this.resetAB();
        this.setaction("jump");
        this.go();
        System.out.print("Jump location:");
        System.out.print(this.getA());
        System.out.print(",");
        System.out.println(this.getB());

    }

    public void testAction() {
        if (this.getaction().equals("walk")) {
            System.out.print("Walk is valid");
        }
        else if (this.getaction().equals("run")) {
            System.out.print("Run is valid");
        }
        else if (this.getaction().equals("skip")) {
            System.out.print("skip is valid");
        }
        else if (this.getaction().equals("jump")) {
            System.out.print("jump is valid");
        } else {
            System.out.print("action is not valid");

        }
    }
    public void testName(){
        System.out.print("My name is:");
        System.out.println(this.getname());
    }

}
