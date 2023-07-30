package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first, second, third;
        first = 1;
        second = 10;
        third = 100;
        System.out.printf("%d\n%d\n%d\n", first, second, third);
        int linkToFirst, linkToSecond, linkToThird;
        linkToFirst = first;
        linkToSecond = second;
        linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", first, second, third, linkToFirst, linkToSecond, linkToThird);
    }
}
