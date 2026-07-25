import java.util.Scanner;

public class Marks {

    // Method to return grade
    public static String getGrade(int mark) {

        if (mark >= 90)
            return "Grade A";
        else if (mark >= 80)
            return "Grade B";
        else if (mark >= 70)
            return "Grade C";
        else if (mark >= 60)
            return "Grade D";
        else
            return "Fail";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Rows = Students, Columns = Subjects
        // Subject 1 = Mathematics
        // Subject 2 = Chemistry
        // Subject 3 = Physics
        int[][] marks = new int[n][3];

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Update Student Mark");
            System.out.println("3. Get Average for a Subject");
            System.out.println("4. Get Average for a Student");
            System.out.println("5. Get Total Marks of a Student");
            System.out.println("6. Display Grades");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID (1-" + n + "): ");
                    int studentID = sc.nextInt();

                    if (studentID >= 1 && studentID <= n) {

                        System.out.print("Enter Mathematics Marks: ");
                        marks[studentID - 1][0] = sc.nextInt();

                        System.out.print("Enter Chemistry Marks: ");
                        marks[studentID - 1][1] = sc.nextInt();

                        System.out.print("Enter Physics Marks: ");
                        marks[studentID - 1][2] = sc.nextInt();

                        System.out.println("Marks added successfully.");

                    } else {

                        System.out.println("Invalid Student ID.");

                    }

                    break;

                case 2:

                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = sc.nextInt();

                    System.out.println("Subjects");
                    System.out.println("1 - Mathematics");
                    System.out.println("2 - Chemistry");
                    System.out.println("3 - Physics");

                    System.out.print("Enter Subject ID: ");
                    int subjectID = sc.nextInt();

                    if (studentID >= 1 && studentID <= n &&
                            subjectID >= 1 && subjectID <= 3) {

                        System.out.print("Enter New Mark: ");
                        marks[studentID - 1][subjectID - 1] = sc.nextInt();

                        System.out.println("Mark updated successfully.");

                    } else {

                        System.out.println("Invalid Student ID or Subject ID.");

                    }

                    break;

                case 3:

                    System.out.println("Subjects");
                    System.out.println("1 - Mathematics");
                    System.out.println("2 - Chemistry");
                    System.out.println("3 - Physics");

                    System.out.print("Enter Subject ID: ");
                    subjectID = sc.nextInt();

                    if (subjectID >= 1 && subjectID <= 3) {

                        int sum = 0;

                        for (int i = 0; i < n; i++) {
                            sum += marks[i][subjectID - 1];
                        }

                        double average = (double) sum / n;

                        System.out.printf("Average Marks = %.2f\n", average);

                    } else {

                        System.out.println("Invalid Subject ID.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = sc.nextInt();

                    if (studentID >= 1 && studentID <= n) {

                        int total = 0;

                        for (int i = 0; i < 3; i++) {
                            total += marks[studentID - 1][i];
                        }

                        double average = total / 3.0;

                        System.out.printf("Average Marks = %.2f\n", average);

                    } else {

                        System.out.println("Invalid Student ID.");

                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID (1-" + n + "): ");
                    studentID = sc.nextInt();

                    if (studentID >= 1 && studentID <= n) {

                        int total = 0;

                        for (int i = 0; i < 3; i++) {
                            total += marks[studentID - 1][i];
                        }

                        System.out.println("Total Marks = " + total);

                    } else {

                        System.out.println("Invalid Student ID.");

                    }

                    break;

                case 6:

                    System.out.println("\n================ GRADE SUMMARY ================");
                    System.out.printf("%-10s %-12s %-12s %-12s%n",
                            "Student", "Math", "Chemistry", "Physics");

                    for (int i = 0; i < n; i++) {

                        System.out.printf("%-10d %-12s %-12s %-12s%n",
                                (i + 1),
                                getGrade(marks[i][0]),
                                getGrade(marks[i][1]),
                                getGrade(marks[i][2]));
                    }

                    break;

                case 7:

                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");

            }
        }
    }
}