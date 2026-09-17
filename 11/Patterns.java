public class Patterns{

    public static void main(String[] args){

        // pattern 1
        int n1 = 7;
        for(int row = 1; row<=n1; row++){
            for(int col = 1; col<=n1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n2 = 3;
        for(int row = 1; row<=n2; row++){
            for(int col = 1; col<=5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 1; row<=5; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n3 = 5;
        for(int row = 1; row<=n3; row++){

            for(int col = 1; col<=n3-row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col<=n3; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}