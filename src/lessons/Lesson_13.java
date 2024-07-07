package lessons;

public class Lesson_13 {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3};
        /**
         * 1,2,3,4,5,0
         *
         * 156451
         * 376321
         * 268123
         */
        int[][] matrice = { {1,2,3},
                            {4,5,6},
                            {7,8,9}};
//        System.out.println(matrice[2][2]);
//        System.out.println(matrice[1][0]);

//        String[][] strings = new String[2][3];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
