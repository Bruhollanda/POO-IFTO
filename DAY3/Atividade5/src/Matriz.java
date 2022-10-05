public class Matriz {

    void draw(int num){
        System.out.printf("Matriz [%d]x[%d]:\n", num, num);

        for (int i=0; i < num; i++){
            for (int j=0; j < num; j++){
                if((i % (num/2) != 0) && (j % (num/2) != 0)){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }// for j
            System.out.println();
        }// for i
    }
}// Matriz
