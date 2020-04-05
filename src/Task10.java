import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк в матрице: ");
        int rowMatrix = scan.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int columnMatrix = scan.nextInt();
        int[][] array = new int[rowMatrix][columnMatrix];
        for (int i = 0; i < rowMatrix; i++) {
            for (int k = 0; k < columnMatrix; k++) {
                System.out.printf("Введите число для элемента [%d][%d]: ",(i+1), (k+1));
                int enteredNumber = scan.nextInt();
                array[i][k] = enteredNumber;
            }
        }
        System.out.println("Первая строка в матрице:");
        for (int j = 0; j < columnMatrix; j++) {
            System.out.printf("[1][%d]%d * 3 = %d ", (j+1),array[0][j], (array[0][j]*3));
        }
        scan.close();
    }
}