public class Piramide {
    public void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }// for j
            System.out.println();
        }//for i
    }// draw
}// Piramide
