package java1702.javase.kaoshi;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 16:04.
 */
public interface Four{
    public double num();
}
class Worker implements Four{
    private double montherSalary;
    public Worker(double montherSalary) {
        super();
        this.montherSalary = montherSalary;
    }
    public double num() {
        return getMontherSalary()*12;
    }
    public double getMontherSalary() {
        return montherSalary;
    }
    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
}
class Peasant implements Four{
    private double montherSalary;
    public Peasant(double montherSalary) {
        super();
        this.montherSalary = montherSalary;
    }
    public double getMontherSalary() {
        return montherSalary;
    }
    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
    public double num() {
        return getMontherSalary()*12;
    }
}
class Teacher implements Four{
    private double montherSalary;
    private double daySalary;

    public Teacher(double montherSalary, double daySalary) {
        super();
        this.montherSalary = montherSalary;
        this.daySalary = daySalary;
    }
    public double num() {
        return getMontherSalary()*12+getDaySalary()*365;
    }
    public double getMontherSalary() {
        return montherSalary;
    }
    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
    public double getDaySalary() {
        return daySalary;
    }
    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
}
class Scientist implements Four{
    private double montherSalary;
    private double projectSalary;
    public Scientist(double montherSalary, double projectSalary) {
        super();
        this.montherSalary = montherSalary;
        this.projectSalary = projectSalary;
    }
    public double num(){
        return getMontherSalary()*12+getProjectSalary();
    }
    public double getMontherSalary() {
        return montherSalary;
    }
    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
    public double getProjectSalary() {
        return projectSalary;
    }
    public void setProjectSalary(double projectSalary) {
        this.projectSalary = projectSalary;
    }
}
class Waiter implements Four{
    private double montherSalary;
    public Waiter(double montherSalary) {
        super();
        this.montherSalary = montherSalary;
    }
    public double num() {
        return getMontherSalary()*12;
    }
    public double getMontherSalary() {
        return montherSalary;
    }
    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
}
class Test {
    public static void main(String[] args) {
        Test a = new Test();
        Worker w = new Worker(1000);
        System.out.println("工人：" + w.num()+"元");

        Peasant p = new Peasant(2500);
        System.out.println("农民："+p.num()+"元");

        Teacher t = new Teacher(4500,50);
        System.out.println("教师："+t.num()+"元");

        Scientist e = new Scientist(10500,30000);
        System.out.println("科学家：" + e.num()+"元");

        Waiter y = new Waiter(3400);
        System.out.println("服务生：" + y.num()+ "元");
    }
}