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

        int n4 = 5;
        for(int row = 1; row<=n4; row++){
            for(int col = 1; col<=n4-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n5 = 5;
        for(int row = 1; row<=n5; row++){
            for(int col = 1; col<=n5-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n6 = 4;
        for(int row = 1; row<=n6; row++){
            for(int col = 1; col<=row-1; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=2*n6-2*row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n7 = 4;
        for(int row = 1; row<=n7; row++){
            for(int col = 1; col<=6; col++){
                if(row == 1 || row == n7){
                    System.out.print("* ");
                }else{
                    if(col == 1 || col == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
System.out.println();
        int n8 = 10;
        for(int row = 1; row<=n8; row++){
            if(row == 1 || row == 2 || row == 10){
                for(int col = 1; col<=row; col++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");

                for(int col = 1; col<=(row-2); col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

            int n9 = 5;
        for(int row = 1; row<=n9; row++){
            for(int col = 1; col<=n9-row; col++){
                System.out.print("  ");
            }
            if(row == 1 || row == n9){
                for(int col = 1; col<=2*row-1; col++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");

                for(int col = 1; col<=2*row-3; col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}