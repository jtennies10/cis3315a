package week4;

/**
 *
 * @author Joshua Tennies
 */
public class C13N16 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        String[] rational1 = args[0].split("/");
        String[] rational2 = args[2].split("/");
        int oneNumerator = Integer.parseInt(rational1[0]);
        int oneDenominator = Integer.parseInt(rational1[1]);
        int twoNumerator = Integer.parseInt(rational2[0]);
        int twoDenominator = Integer.parseInt(rational2[0]);

        switch (args[1].charAt(0)) {
            case '+':
                System.out.println(add(oneNumerator, oneDenominator, twoNumerator,
                        twoDenominator));
            case '-':
                System.out.println(subtract(oneNumerator, oneDenominator, twoNumerator,
                        twoDenominator));
            case '.':
                System.out.println(multiply(oneNumerator, oneDenominator, twoNumerator,
                        twoDenominator));
            case '/':
                System.out.println(divide(oneNumerator, oneDenominator, twoNumerator,
                        twoDenominator));

        }
    }

    public static String add(int oneNumerator, int oneDenominator, 
            int twoNumerator, int twoDenominator) {
        String original = String.format("%d/%d + %d/%d", oneNumerator,
                oneDenominator, twoNumerator, twoDenominator);
        int temp = oneDenominator;
        oneNumerator *= twoDenominator;
        oneDenominator *= twoDenominator;
        twoNumerator *= temp;
        twoDenominator *= temp;
        return String.format(original + " = %d/%d", (oneNumerator + twoNumerator), twoDenominator);
    }

    public static String subtract(int oneNumerator, int oneDenominator, 
            int twoNumerator, int twoDenominator) {
        String original = String.format("%d/%d - %d/%d", oneNumerator,
                oneDenominator, twoNumerator, twoDenominator);
        int temp = oneDenominator;
        oneNumerator *= twoDenominator;
        oneDenominator *= twoDenominator;
        twoNumerator *= temp;
        twoDenominator *= temp;
        return String.format(original + " = %d/%d", (oneNumerator - twoNumerator), twoDenominator);
    }
    
    public static String multiply(int oneNumerator, int oneDenominator, 
        int twoNumerator, int twoDenominator) {
        String original = String.format("%d/%d * %d/%d", oneNumerator,
                oneDenominator, twoNumerator, twoDenominator); 
        return String.format(original + " = %d/%d", (oneNumerator * twoNumerator),
                (oneDenominator * twoDenominator));
    }
    
    public static String divide(int oneNumerator, int oneDenominator, 
        int twoNumerator, int twoDenominator) {
        String original = String.format("%d/%d / %d/%d", oneNumerator,
                oneDenominator, twoNumerator, twoDenominator);
        return String.format(original + " = %d/%d", (oneNumerator * twoDenominator),
                (oneDenominator * twoNumerator));
            
    }
}
