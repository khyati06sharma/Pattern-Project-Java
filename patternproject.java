import java.util.Scanner;

public class patternproject {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1. Right-Angled Triangle (Stars)");
            System.out.println("2. Right-Angled Triangle (Numbers)");
            System.out.println("3. Centered Pyramid (Stars)");
            System.out.println("4. Checkerboard 1s and 0s");
            System.out.println("5. X Pattern");
            System.out.println("6. Hollow Square");
            System.out.println("7. Alternate Star Grid");
            System.out.println("8. Pascal-Like Triangle (1 & 0)");
            System.out.println("9. Letter M Pattern (with Stars)");
            System.out.println("10. X0 Zigzag Pyramid");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\nPattern 1: Right-Angled Triangle (Stars)");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("\nPattern 2: Right-Angled Triangle (Numbers)");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("\nPattern 3: Centered Pyramid (Stars)");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\nPattern 4: Checkerboard 1s and 0s");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print((i+j)%2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\nPattern 5: X Pattern (Diagonal Stars)");
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j==i || j==n-i+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("\nPattern 6: Hollow Square");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print((i==1||i==5||j==1||j==5)?"*":" ");
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("\nPattern 7: Alternate Star Grid");
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print((i+j)%2 == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("\nPattern 8: Pascal-Like Triangle (1 & 0)");
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((j==0 || j==i)?"1 ":"0 ");
            }
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("\nPattern 9: Letter M Pattern (Stars)");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(j == 0 || j == 6 || (i == j && i < 4) || (i + j == 6 && i < 4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern10() {
        System.out.println("\nPattern 10: X0 Zigzag Pyramid");
        for(int i=0;i<4;i++) {
            System.out.print("  ".repeat(3 - i));
            for(int j=0;j<=i;j++)
                System.out.print((j%2==0?"X":"0") + "   ");
            System.out.println();
        }
    }
}
