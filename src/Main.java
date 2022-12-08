import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    public static void task1() {
        System.out.println(" Задача 1");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task2() {
        System.out.println(" Задача 1");
        double[] arr = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task3() {
        System.out.println(" Задача 1");
        int[] arr = new int[]{4, 6, 8, 9, 12, 15, 17};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task4() {
        System.out.println(" Задача 2");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            if (i == 2) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + " ,");
            }
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int j = 0; j < arr2.length; j++) {
            if (j == arr2.length - 1) {
                System.out.println(arr2[j]);
            } else {
                System.out.print(arr2[j] + " ,");
            }
        }
        int[] arr3 = {4, 6, 8, 9, 12, 15, 17};
        for (int x = 0; x < arr3.length; x++) {
            if (x == arr3.length - 1) {
                System.out.println(arr3[x]);
            } else {
                System.out.print(arr3[x] + " ,");
            }
        }
    }

    public static void task5() {
        System.out.println(" Задача 3");
        int[] arr1 = {1, 2, 3};
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + " ,");
            }
        }
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int j = arr2.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(arr2[j]);
            } else {
                System.out.print(arr2[j] + " ,");
            }
        }
        int[] arr3 = {4, 6, 8, 9, 12, 15, 17};
        for (int x = arr3.length - 1; x >= 0; x--) {
            if (x == 0) {
                System.out.println(arr3[x]);
            } else {
                System.out.print(arr3[x] + ", ");
            }
        }
    }

    public static void task6() {
        System.out.println(" Задача 4");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task7() {
        System.out.println(" Задача 5");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task8() {
        System.out.println(" Задача 6");
        int[] arr = generateRandomArray();
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    public static void task9() {
        System.out.println(" Задача 6");
        int[] arr = generateRandomArray();
        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
    }

    public static void task10() {
        System.out.println(" Задача 7");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
            sum = sum / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task11() {
        System.out.println(" Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char length = 0;
        for (char element : reverseFullName)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);

        }
    }
}


