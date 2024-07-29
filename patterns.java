public class patterns {
    public static void main(String[] args) {

        // squre pattern
        // for(int i=0; i<5 ; i++){
        // for(int j=0; j<5; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // hollow ractangle

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5) {
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid
        // for (int i = 5; i > 1; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // inverted half pyramid(180 deg rotated)
        // for (int i = 1; i <= 5; i++) {
        //     for (int k = 1; k <= 5-i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // half pyramid with number
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //inverted half pyramid with number
        // for(int i=5; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        //Floyd's triangle
        // int num = 1;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num++);
        //     }
        //     System.out.println();
        // }



        // 0-1 triangle
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}
