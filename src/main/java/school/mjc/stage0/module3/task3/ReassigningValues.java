package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println("First: " + first +"\n"
                + "Second: " + second + "\n"
                + "Third: " + third);
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        first = 15;
        second = 6;
        third = 4;
        System.out.println("LinkToFirst: " + linkToFirst);
        System.out.println("LinkToSecond: " + linkToSecond);
        System.out.println("LinkToThird: " + linkToThird);
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);

    }
}
