package tdd1;

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

}
