public class Patterns {

    public static void main(String[] args) {

        // pattern 1
        int n1 = 7;
        for (int row = 1; row <= n1; row++) {
            for (int col = 1; col <= n1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n2 = 3;
        for (int row = 1; row <= n2; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n3 = 5;
        for (int row = 1; row <= n3; row++) {

            for (int col = 1; col <= n3 - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n3; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        int n4 = 5;
        for (int row = 1; row <= n4; row++) {
            for (int col = 1; col <= n4 - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n5 = 5;
        for (int row = 1; row <= n5; row++) {
            for (int col = 1; col <= n5 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n6 = 4;
        for (int row = 1; row <= n6; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * n6 - 2 * row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n7 = 4;
        for (int row = 1; row <= n7; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n7) {
                    System.out.print("* ");
                } else {
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println();
        int n8 = 10;
        for (int row = 1; row <= n8; row++) {
            if (row == 1 || row == 2 || row == 10) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1; col <= (row - 2); col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int n9 = 5;
        for (int row = 1; row <= n9; row++) {
            for (int col = 1; col <= n9 - row; col++) {
                System.out.print("  ");
            }
            if (row == 1 || row == n9) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int n10 = 5;
        for (int row = 1; row <= n10; row++) {
            for (int col = 1; col <= n10 - row; col++) {
                System.out.print("  ");
            }
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= (n10 - 1); row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            if (row == (n10 - 1)) {
                System.out.print("* ");
            } else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * (n10 - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int n11 = 4;
        for (int row = 1; row <= n11; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (n11 - row); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n11; row++) {
            for (int col = 1; col <= n11 - row + 1; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (row - 1); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n11 - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n12 = 5;
        for (int row = 1; row <= n12; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

        int n13 = 5;
        for (int row = 1; row <= n13; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        int n14 = 5;
        int count = 1;
        for (int row = 1; row <= n14; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        int n15 = 5;
        for (int row = 1; row <= n15; row++) {
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

        int n16 = 5;
        for (int row = 1; row <= n16; row++) {
            for (int col = 1; col <= row; col++) {
                int a = n16 - col;
                int b = 'A';
                int ans = b + a;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

        int n17 = 4;
        for (int row = 1; row <= n17; row++) {
            for (int col = 1; col <= n16 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            int decrementVal = row-1;
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(decrementVal + " ");
                decrementVal--;
            }
            System.out.println();
        }
        
        int n18 = 4;
        for(int row = 1; row<=n18; row++){
            for(int col = 1; col<=n18-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=2*row-1; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }

        int n19 = 5;
        for(int row = 1; row<=n19; row++){
            for(int col = 1; col<=n19-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=row; col++){
                int a = col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            char toPrint = (char)(row+'A'-2);
            for(int col = 1; col<=row-1; col++){
                System.out.print(toPrint + " ");
                toPrint--;
            }
            System.out.println();
        }

    }

}
