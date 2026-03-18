package edu.cmu.cs.cs214.rec04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DelegationSortedIntList list = new DelegationSortedIntList();

        // --- ТАНЫ ХҮССЭН ХЭСЭГ: ЭХЛЭЭД ХЭДЭН ТОО НЭМЭХИЙГ АСУУХ ---
        System.out.print("Хэдэн ширхэг тоо нэмэх вэ? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "-р тоог оруулна уу: ");
            int num = scanner.nextInt();
            list.add(num);
        }
        // -------------------------------------------------------

        boolean running = true;
        System.out.println("\n--- ОДОО УДИРДЛАГЫН ЦЭС РҮҮ ШИЛЖЛЭЭ ---");

        while (running) {
            System.out.println("\nОдоогийн жагсаалт: ");
            printList(list);
            System.out.println("Нийт нэмэгдсэн оролдлого (totalAdded): " + list.getTotalAdded());
            
            System.out.println("\nДараагийн үйлдлээ сонгоно уу:");
            System.out.println("1. Дахин тоо нэмэх (Add)");
            System.out.println("2. Тоо устгах (Remove)");
            System.out.println("3. Програмаас гарах (Exit)");
            System.out.print("Таны сонголт: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Нэмэх тоогоо оруулна уу: ");
                    int addNum = scanner.nextInt();
                    list.add(addNum);
                    break;

                case 2:
                    if (list.size() == 0) {
                        System.out.println("Устгах тоо алга, жагсаалт хоосон байна!");
                        break;
                    }
                    System.out.print("Устгах тоогоо оруулна уу: ");
                    int removeNum = scanner.nextInt();
                    if (list.remove(removeNum)) {
                        System.out.println(removeNum + " амжилттай устлаа.");
                    } else {
                        System.out.println(removeNum + " жагсаалтад алга.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Програм дууслаа. Баяртай!");
                    break;

                default:
                    System.out.println("Буруу сонголт! Дахин оролдоно уу.");
            }
        }
        scanner.close();
    }

    private static void printList(IntegerList list) {
        if (list.size() == 0) {
            System.out.print("[ Хоосон ]");
        } else {
            System.out.print("[ ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + (i == list.size() - 1 ? "" : ", "));
            }
            System.out.print(" ]");
        }
        System.out.println();
    }
}