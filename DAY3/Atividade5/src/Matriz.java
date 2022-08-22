public class Matriz {

    void desenhar(int num){
        System.out.printf("\nMatriz [%d]x[%d]:\n", num, num);

        for (int i=0; i < num; i++){
            for (int j=0; j < num; j++){
                if((i % (num/2) != 0) && (j % (num/2) != 0)){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}// Matriz
