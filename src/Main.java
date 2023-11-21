// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        // ใส่ n
        System.out.print("จำนวนเลขกี่ตัวที่เราจะเรียง: ");
        int n = sc.nextInt();

        // ให้ป้อนจำน วนตามที่กรอก n ตัว มาให้ครบก่อน
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) { //อันนี้ให้ป้อนให้ครบ n
            System.out.print("เลขที่ " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // เรียกใช้ให้มันเรียงลำดับบบ
        sortNumbers(numbers);
        }
    // เรียงลำดับArrของจำนวนเต็ม
    private static void sortNumbers(int[] numbers) {
        Arrays.sort(numbers); //เรียงลำดับตัวเลข
        System.out.println("เรียงลำดับจากน้อยไปมาก:");
        for (int numb : numbers) {
            System.out.println(numb);
        }
    }
}
//อธิบายตามความเข้าใจ
//ใช้ Scanner เพื่ออ่านข้อมูล
//จำนวนเต็ม n ถูกใส่ไว้ในตัวแปร n
//arr numbersสร้างขึ้นเพื่อเก็บจำนวน n ตัว
//ใช้ลูป for เพื่ออ่านและเก็บค่าจำนวน n ตัวที่ป้อนมา
//sortNumbers ใช้เพื่อเรียงลำดับ Arr numbers

//ที่มาhttps://stackoverflow.com/questions/8938235/sort-an-array-in-java