package equationsjava;
public class Equationsjava {
public static void main(String[] args) {
        // Given values
        int x = 6;
        int y = 20;
        int z = 13;

        // First equation: 2x² + y²
        double equation1 = 2 * Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println("Result of the first equation (2x² + y²): " + equation1);

        // Second equation: 3x + y - 3z²
        double equation2 = 3 * x + y - 3 * Math.pow(z, 2);
        System.out.println("Result of the second equation (3x + y - 3z²): " + equation2);

        // Third equation: 2x - 2y + 5z²
        double equation3 = 2 * x - 2 * y + 5 * Math.pow(z, 2);
        System.out.println("Result of the third equation (2x - 2y + 5z²): " + equation3);
    }
}

    
  
      
    }
    
