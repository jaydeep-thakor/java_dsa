public class Loop{

    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++){
            System.out.println("Value of i : " + i);
        }
        for(int i = 1; i<=10; i+=2){
            System.out.println(i);
        }

        // nested loops
        for(int i = 0; i<3; i++){
            for(int j = 1; j<=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("i = "+i + " " + "j = "+j + " ");
            }
        System.out.println();
        }

        // break
        for(int i = 1; i<=10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        // continue
        for(int i = 1; i<=10; i++){
            if(i == 1){  // if(i == 1 || i == 2 || i == 3 || i == 4){
                continue;
            }
            System.out.println(i);
        }

        // while loop
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        // nested while loop
        int j = 1;
        while(j<=2){
            int k = 1;
            while(k<=7){
                System.out.println("j = " + j + " k = " + k);
                k++;
            }
            j++;
        }

        // do while loop
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while(x<=7);

    }

}