package Lab0;

public class BuildTriangle {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numberss = new int[]{4, 7, 13};
        int num = 0;
        while(num < 10) {
            for(int i = 0; i <= num; i++) {
                System.out.print("*");
            }
            System.out.println();
            num++;
        }
    }
}
