import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add student marks");
            System.out.println("2. Update student mark");
            System.out.println("3. Get average for a subject");
            System.out.println("4. Get average for a student");
            System.out.println("5. Get total marks of a student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Add student marks
                    System.out.print("Enter Student ID (1-" + n + "): ");
                    int studentID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= n) {
                        System.out.print("Enter Mathematics marks: ");
                        marks[studentID - 1][0] = scanner.nextInt();

                        System.out.print("Enter Chemistry marks: ");
                        marks[studentID - 1][1] = scanner.nextInt();

                        System.out.print("Enter Physics marks: ");
                        marks[studentID - 1][2] = scanner.nextInt();

                        System.out.println("Marks added successfully.");
                    } else {
                        System.out.println("Invalid Student ID.");
                    }
                    break;

                case 2:
                    // Update student mark
                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = scanner.nextInt();

                    System.out.println("Subject IDs:");
                    System.out.println("1 - Mathematics");
                    System.out.println("2 - Chemistry");
                    System.out.println("3 - Physics");

                    System.out.print("Enter Subject ID: ");
                    int subjectID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= n &&
                            subjectID >= 1 && subjectID <= 3) {

                        System.out.print("Enter new mark: ");
                        marks[studentID - 1][subjectID - 1] = scanner.nextInt();

                        System.out.println("Mark updated successfully.");
                    } else {
                        System.out.println("Invalid Student ID or Subject ID.");
                    }
                    break;

                case 3:
                    // Average for a subject
                    System.out.println("Subject IDs:");
                    System.out.println("1 - Mathematics");
                    System.out.println("2 - Chemistry");
                    System.out.println("3 - Physics");

                    System.out.print("Enter Subject ID: ");
                    subjectID = scanner.nextInt();

                    if (subjectID >= 1 && subjectID <= 3) {

                        int sum = 0;

                        for (int i = 0; i < n; i++) {
                            sum += marks[i][subjectID - 1];
                        }

                        double average = (double) sum / n;

                        System.out.println("Average marks for subject = " + average);
                    } else {
                        System.out.println("Invalid Subject ID.");
                    }
                    break;

                case 4:
                    // Average for a student
                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= n) {

                        int total = 0;

                        for (int i = 0; i < 3; i++) {
                            total += marks[studentID - 1][i];
                        }

                        double average = total / 3.0;

                        System.out.println("Average marks = " + average);
                    } else {
                        System.out.println("Invalid Student ID.");
                    }
                    break;

                case 5:
                    // Total marks of a student
                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= n) {

                        int total = 0;

                        for (int i = 0; i < 3; i++) {
                            total += marks[studentID - 1][i];
                        }

                        System.out.println("Total marks = " + total);
                    } else {
                        System.out.println("Invalid Student ID.");
                    }
                    break;

                case 6:
                    System.out.println("Program terminated.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}